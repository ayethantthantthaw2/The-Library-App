package com.attt.thelibraryapp.activities

import alirezat775.lib.carouselview.Carousel
import alirezat775.lib.carouselview.CarouselView
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.attt.thelibraryapp.R
import com.attt.thelibraryapp.adapters.CarouselViewAdapter
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

private lateinit var mCarouselViewAdapter:CarouselViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        setupAdapters()
        setupTabLayout()
    }

    private fun setupTabLayout() {
        val tabEBooks=tlBooks.newTab()
        tabEBooks.text=getString(R.string.tab_ebook)
        tlBooks.addTab(tabEBooks)

        val tabAudioBooks=tlBooks.newTab()
        tabAudioBooks.text=getString(R.string.tab_audiobook)
        tlBooks.addTab(tabAudioBooks)



    }

    private fun setupAdapters() {
        mCarouselViewAdapter= CarouselViewAdapter()
        val carousel=Carousel(this,rlCarousel,mCarouselViewAdapter)

        carousel.setOrientation(CarouselView.HORIZONTAL, false)
        carousel.scaleView(true)
    }
}