package com.nexis.vpnappandroid.util

import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.google.android.material.snackbar.Snackbar
import com.nexis.vpnappandroid.R

fun String.show(v: View, message: String){
    Snackbar.make(v, message, Snackbar.LENGTH_LONG).show()
}

fun ImageView.downloadImageUrl(imageUrl: String?){
    val options = RequestOptions()
        .error(R.mipmap.ic_launcher_round)

    Glide.with(context)
        .setDefaultRequestOptions(options)
        .load(imageUrl)
        .into(this)
}

@BindingAdapter("android:downloadVpnImage")
fun downloadVpnImage(view: ImageView, url: String?){
    view.downloadImageUrl(url)
}