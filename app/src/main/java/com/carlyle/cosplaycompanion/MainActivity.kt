package com.carlyle.cosplaycompanion

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import java.util.*


class MainActivity : FragmentActivity() {
    lateinit var viewpager: ViewPager2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewpager = findViewById(R.id.view_pager)

        val adapter = MainActivityPagerAdapter(this)
        viewpager.adapter = adapter


    }
    private inner class MainActivityPagerAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity){
        override fun getItemCount(): Int{
             return 3
        }
        override fun createFragment(position: Int): Fragment {
            return FeaturedListFragment()
        }
    }
}