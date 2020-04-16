package com.retrofit1.adapters

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import android.R
import com.bumptech.glide.Priority


object ImageUrlBindingAdapter {
    @JvmStatic
    @BindingAdapter("android:img")
    fun setImageUrl(view: ImageView, url: String?) {
        val options = RequestOptions()
                .centerCrop()
                .placeholder(com.retrofit1.R.drawable.no_img)
                .error(com.retrofit1.R.drawable.no_img)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .priority(Priority.HIGH)
        Glide.with(view.context).load(url).apply(options).into(view)
    }
}