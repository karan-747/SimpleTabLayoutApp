package com.example.simpletablayoutapp

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.viewpager2.widget.ViewPager2
import com.example.simpletablayoutapp.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.viewPager.apply {
            adapter = TabAdapter(supportFragmentManager,lifecycle)
            orientation = ViewPager2.ORIENTATION_HORIZONTAL
        }
        val tabs = arrayListOf<String>("Tab1","Tab2","Tab3")


        TabLayoutMediator (binding.tabLayout,binding.viewPager){
            tab,position->tab.text = tabs[position]
        }.attach()





    }
}