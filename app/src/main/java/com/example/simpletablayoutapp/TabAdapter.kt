package com.example.simpletablayoutapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class TabAdapter(private val fragmentManager: FragmentManager,private val lifecycle: Lifecycle):FragmentStateAdapter(fragmentManager,lifecycle) {
    override fun getItemCount(): Int {
        return 3

    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0->{
                TabFragmentItem(position)
            }

            1->{
                TabFragmentItem(position)
            }

            2->{
                TabFragmentItem(position)
            }

            else->{
                TabFragmentItem(0)
            }

        }
    }
}