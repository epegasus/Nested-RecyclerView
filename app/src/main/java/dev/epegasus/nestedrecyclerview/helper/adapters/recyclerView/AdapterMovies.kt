package dev.epegasus.nestedrecyclerview.helper.adapters.recyclerView

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import dev.epegasus.nestedrecyclerview.R
import dev.epegasus.nestedrecyclerview.databinding.ListItemMovieBinding
import dev.epegasus.nestedrecyclerview.helper.interfaces.OnMovieItemClickListener
import dev.epegasus.nestedrecyclerview.helper.models.Movie

class AdapterMovies(private val onMovieItemClickListener: OnMovieItemClickListener) : ListAdapter<Movie, AdapterMovies.ViewHolder>(diffUtil) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = DataBindingUtil.inflate<ListItemMovieBinding>(layoutInflater, R.layout.list_item_movie, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = getItem(position)
        holder.binding.apply {
            this.item = item
            this.itemClick = onMovieItemClickListener
        }
    }

    inner class ViewHolder(val binding: ListItemMovieBinding) : RecyclerView.ViewHolder(binding.root)

    companion object {
        val diffUtil = object : DiffUtil.ItemCallback<Movie>() {
            override fun areItemsTheSame(oldItem: Movie, newItem: Movie): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: Movie, newItem: Movie): Boolean {
                return oldItem == newItem
            }
        }
    }
}
