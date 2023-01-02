package dev.epegasus.nestedrecyclerview

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import dev.epegasus.nestedrecyclerview.databinding.ActivityMainBinding
import dev.epegasus.nestedrecyclerview.helper.adapters.recyclerView.AdapterCategories
import dev.epegasus.nestedrecyclerview.helper.dataProviders.DpCategories
import dev.epegasus.nestedrecyclerview.helper.interfaces.OnCategoryItemClickListener
import dev.epegasus.nestedrecyclerview.helper.interfaces.OnMovieItemClickListener
import dev.epegasus.nestedrecyclerview.helper.models.Category
import dev.epegasus.nestedrecyclerview.helper.models.Movie

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val adapterCategories by lazy { AdapterCategories(categoryItemClick, movieItemClick) }

    private val dpCategories by lazy { DpCategories() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        initRecyclerView()
        fetchData()

        binding.srlRefreshMain.setOnRefreshListener { fetchData() }
    }

    private fun initRecyclerView() {
        binding.rvCategoriesMain.adapter = adapterCategories
    }

    private fun fetchData() {
        binding.srlRefreshMain.isRefreshing = false
        adapterCategories.submitList(dpCategories.categoriesList)
    }

    private val categoryItemClick = object : OnCategoryItemClickListener {
        override fun onReadMoreClick(category: Category) {
            Toast.makeText(this@MainActivity, category.title, Toast.LENGTH_SHORT).show()
        }
    }

    private val movieItemClick = object : OnMovieItemClickListener {
        override fun onItemClick(movie: Movie) {
            Toast.makeText(this@MainActivity, movie.title, Toast.LENGTH_SHORT).show()
        }
    }
}