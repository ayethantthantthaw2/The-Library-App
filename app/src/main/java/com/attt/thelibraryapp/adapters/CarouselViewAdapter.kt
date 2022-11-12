package com.attt.thelibraryapp.adapters

import alirezat775.lib.carouselview.CarouselAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.attt.thelibraryapp.R


class CarouselViewAdapter : CarouselAdapter() {


    override fun onBindViewHolder(holder: CarouselViewHolder, position: Int) {


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarouselViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.viewholder_carousel, parent, false)
        return CarouselViewViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 5
    }


    inner class CarouselViewViewHolder(itemView: View) : CarouselViewHolder(itemView) {}


}


private fun CarouselAdapter.CarouselViewHolder.bindData() {


}
