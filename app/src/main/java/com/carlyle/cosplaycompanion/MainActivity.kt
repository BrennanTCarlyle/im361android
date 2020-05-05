package com.carlyle.cosplaycompanion

import android.graphics.PorterDuff
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import java.util.*


class MainActivity : FragmentActivity() {
    lateinit var viewpager: ViewPager2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewpager = findViewById(R.id.view_pager)

        val adapter = MainActivityPagerAdapter(this)
        viewpager.adapter = adapter

        val tablayout = findViewById<TabLayout>(R.id.tab_layout)
        val primaryColor = ContextCompat.getColor(this, R.color.colorPrimary)

        TabLayoutMediator(tablayout, viewpager)
        {
            tab,position ->
            if(position == 0)
            {
                tab.text = "Featured"
                tab.setIcon(R.drawable.tab_featured)

            }
            if(position == 1)
            {
                tab.text = "Movies"
                tab.setIcon(R.drawable.ic_movies)
            }
            if(position == 2)
            {
                tab.text = "Video Games"
                tab.setIcon(R.drawable.ic_videogames)
            }

            tab.icon?.setColorFilter(primaryColor, PorterDuff.Mode.SRC_ATOP)
        }.attach()

    }
    override fun onBackPressed()
    {
        if (viewpager.currentItem > 0)
        {
            viewpager.currentItem -= 1
        } else
        {
            super.onBackPressed()
        }
    }
    private inner class MainActivityPagerAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity){
        override fun getItemCount(): Int{
             return 3
        }
        override fun createFragment(position: Int): Fragment {

            if(position == 0)
            {
                return FeaturedListFragment()
            }
            if(position == 1)
            {
                return Movies()
            }
            if(position == 2)
            {
                return VideoGameListFragment()
            }

            return FeaturedListFragment()
        }
    }
}