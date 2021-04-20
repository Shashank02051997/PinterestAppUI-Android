package com.shashank.pinterestappui.ui.dashboard.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DefaultItemAnimator
import com.shashank.pinterestappui.R
import com.shashank.pinterestappui.databinding.HomeFragmentBinding
import com.shashank.pinterestappui.ui.adapters.CustomAdapterAll

class HomeFragment : Fragment() {

    private lateinit var dataBind: HomeFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dataBind = DataBindingUtil.inflate(
            inflater,
            R.layout.home_fragment,
            container,
            false
        )
        return dataBind.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupUI()
    }

    private fun setupUI() {

        dataBind.recyclerView.apply {
            itemAnimator = DefaultItemAnimator()
            adapter = CustomAdapterAll(getAllItemList())
        }
    }

    private fun getAllItemList(): ArrayList<Int> {
        return arrayListOf(
            R.drawable.favorite_img_1,
            R.drawable.favorite_img_2,
            R.drawable.favorite_img_3,
            R.drawable.favorite_img_4,
            R.drawable.favorite_img_5,
            R.drawable.favorite_img_6
        )
    }
}