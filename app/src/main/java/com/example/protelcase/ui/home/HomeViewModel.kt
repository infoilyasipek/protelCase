package com.example.protelcase.ui.home

import androidx.lifecycle.*
import com.example.domain.models.News
import com.example.domain.usecases.GetNewsUseCase
import com.example.domain.models.Resource
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class HomeViewModel @Inject constructor(
    private val getNewsUseCase: GetNewsUseCase,
) : ViewModel() {

    private val compositeDisposable = CompositeDisposable()
    var dateFilter = MutableLiveData<String>()

    val newsList: LiveData<Resource<List<News>>> = dateFilter.switchMap {
        loadNewsList()
    }

    private fun loadNewsList(): LiveData<Resource<List<News>>> {
        val result = MutableLiveData<Resource<List<News>>>(Resource.loading(null))
        getNewsUseCase.execute("football",dateFilter.value!!,"publishedAt")
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe({
                result.postValue(Resource.success(it))
            },{
                result.postValue(Resource.error(it.message ?: "Unknown error",null))
            }).let {
                compositeDisposable.add(it)
            }

        return result
    }

    fun setDateFilter(dateFilter: String) {
        this.dateFilter.value = dateFilter
    }

    fun refresh() {
        dateFilter.value = dateFilter.value
    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.clear()
    }

}