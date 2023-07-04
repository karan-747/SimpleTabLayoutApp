package com.example.simpletablayoutapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.simpletablayoutapp.databinding.FragmentTabItemBinding
import java.text.FieldPosition

class TabFragmentItem (private val position: Int): Fragment(R.layout.fragment_tab_item) {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<FragmentTabItemBinding>(inflater,R.layout.fragment_tab_item,container,false)
        when(position){
            0->{
                binding.tvTabItem.text = position.toString()
            }
            1->{
                binding.tvTabItem.text = position.toString()
            }
            2->{
                binding.tvTabItem.text = position.toString()
            }
        }
        return binding.root

    }

}