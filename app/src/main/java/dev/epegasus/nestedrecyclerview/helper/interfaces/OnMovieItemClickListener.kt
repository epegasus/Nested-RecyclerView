package dev.epegasus.nestedrecyclerview.helper.interfaces

import dev.epegasus.nestedrecyclerview.helper.models.Movie

interface OnMovieItemClickListener {
    fun onItemClick(movie: Movie)
}