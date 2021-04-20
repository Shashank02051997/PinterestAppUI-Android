package com.shashank.pinterestappui.ui.dashboard.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DefaultItemAnimator
import com.shashank.pinterestappui.R
import com.shashank.pinterestappui.data.model.BoardItem
import com.shashank.pinterestappui.databinding.SavedFragmentBinding
import com.shashank.pinterestappui.ui.adapters.CustomAdapterBoard

class SavedFragment : Fragment() {

    private lateinit var dataBind: SavedFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dataBind = DataBindingUtil.inflate(
            inflater,
            R.layout.saved_fragment,
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
            adapter = CustomAdapterBoard(getBoardItemList())
        }
    }

    private fun getBoardItemList(): ArrayList<BoardItem> {
        return arrayListOf(
            BoardItem(R.drawable.food_img_1, "Dinner ideas", "12 minutes ago"),
            BoardItem(R.drawable.food_img_2, "Movie ideas", "20 minutes ago"),
            BoardItem(R.drawable.food_img_3, "Food ideas", "33 minutes ago"),
            BoardItem(R.drawable.food_img_4, "Traveling ideas", "42 minutes ago"),
            BoardItem(R.drawable.food_img_5, "Holidays ideas", "50 minutes ago"),
        )
    }
}