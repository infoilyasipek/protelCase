package com.example.protelcase.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.domain.models.News
import com.example.protelcase.databinding.ItemNewsBinding
import com.example.protelcase.interfaces.OnItemClickedListener


class NewsAdapter(private val listener: OnItemClickedListener) :
    ListAdapter<News, NewsAdapter.WeatherViewHolder>(NewsDiffCallBack()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeatherViewHolder {
        val binding = ItemNewsBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return WeatherViewHolder(binding)
    }

    override fun onBindViewHolder(holder: WeatherViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class WeatherViewHolder(private val binding: ItemNewsBinding) : RecyclerView.ViewHolder(binding.root) {
        init {
            binding.root.setOnClickListener {
                listener.onItemClicked(adapterPosition)
            }
        }
        fun bind(news: News){
            binding.news = news
        }
    }

    class NewsDiffCallBack: DiffUtil.ItemCallback<News>(){
        override fun areItemsTheSame(oldItem: News, newItem: News): Boolean {
            return oldItem.title + oldItem.publishedAt   == newItem.title + newItem.publishedAt
        }

        override fun areContentsTheSame(oldItem: News, newItem: News): Boolean {
            return oldItem == newItem
        }
    }
}
