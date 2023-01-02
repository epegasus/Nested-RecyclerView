package dev.epegasus.nestedrecyclerview.helper.adapters.binding

import androidx.databinding.BindingAdapter
import com.google.android.material.imageview.ShapeableImageView

@BindingAdapter("imageId")
fun ShapeableImageView.setImageId(imageId: Int) {
    this.setImageResource(imageId)
}