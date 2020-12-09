package com.example.data.di

import com.example.data.repo.NewsRemoteRepoImpl
import com.example.domain.repositories.NewsRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
interface RepositoryModule {

    @Singleton
    @Binds
    fun bindNewsRepository(newsRemoteRepoImpl: NewsRemoteRepoImpl): NewsRepository

}