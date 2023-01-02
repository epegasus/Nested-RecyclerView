package dev.epegasus.nestedrecyclerview.helper.adapters.recyclerView

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import dev.epegasus.nestedrecyclerview.R
import dev.epegasus.nestedrecyclerview.databinding.ListItemCategoryBinding
import dev.epegasus.nestedrecyclerview.helper.dataProviders.DpMovies
import dev.epegasus.nestedrecyclerview.helper.interfaces.OnCategoryItemClickListener
import dev.epegasus.nestedrecyclerview.helper.interfaces.OnMovieItemClickListener
import dev.epegasus.nestedrecyclerview.helper.models.Category

class AdapterCategories(private val onCategoryItemClickListener: OnCategoryItemClickListener, private val onMovieItemClickListener: OnMovieItemClickListener) : ListAdapter<Category, AdapterCategories.ViewHolder>(diffUtil) {

    private val dpMovies by lazy { DpMovies() }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = DataBindingUtil.inflate<ListItemCategoryBinding>(layoutInflater, R.layout.list_item_category, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = getItem(position)
        val adapterMovie = AdapterMovies(onMovieItemClickListener)
        holder.binding.apply {
            this.item = item
            this.itemClick = onCategoryItemClickListener
            this.rvMoviesListItemCategories.adapter = adapterMovie
            adapterMovie.submitList(dpMovies.getMovieList(item.id))
        }
    }

    inner class ViewHolder(val binding: ListItemCategoryBinding) : RecyclerView.ViewHolder(binding.root)

    companion object {
        val diffUtil = object : DiffUtil.ItemCallback<Category>() {
            override fun areItemsTheSame(oldItem: Category, newItem: Category): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: Category, newItem: Category): Boolean {
                return oldItem == newItem
            }
        }
    }
}
