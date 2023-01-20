package com.godigital.tmdb.ui.main

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.godigital.tmdb.databinding.ItemMainBinding
import com.godigital.tmdb.domain.model.Movie


class MainAdapter(
    private val context: Context,
    private val listener: AdapterListener,
    private val dataSetUser: List<Movie>,
) :
    RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemMainBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind()
        Glide.with(context)
            .load("https://image.tmdb.org/t/p/w500/${dataSetUser[position].posterPath}")
            .into(holder.binding.ivItem)
    }

    override fun getItemCount(): Int {
        return dataSetUser.size
    }

    interface AdapterListener {
        fun goToDetailsListener(movie: Movie)
    }

    inner class ViewHolder(val binding: ItemMainBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind() {
            binding.executePendingBindings()
            binding.ivItem.setOnClickListener {
                listener.goToDetailsListener(dataSetUser[adapterPosition])
            }
        }
    }
}
