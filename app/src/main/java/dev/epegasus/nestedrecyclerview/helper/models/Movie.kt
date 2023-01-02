package dev.epegasus.nestedrecyclerview.helper.models

data class Movie(
    val id: Int,
    val imageId: Int,
    val title: String,
    val categoryId: Int,
    val createdDate: Long = System.currentTimeMillis()
)
