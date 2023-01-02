package dev.epegasus.nestedrecyclerview.helper.interfaces

import dev.epegasus.nestedrecyclerview.helper.models.Category

interface OnCategoryItemClickListener {
    fun onReadMoreClick(category: Category)
}