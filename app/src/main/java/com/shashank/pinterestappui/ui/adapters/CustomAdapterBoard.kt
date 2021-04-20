package com.shashank.pinterestappui.ui.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.shashank.pinterestappui.R
import com.shashank.pinterestappui.data.model.BoardItem
import com.shashank.pinterestappui.databinding.ListItemBoardBinding

class CustomAdapterBoard(private val boardList: ArrayList<BoardItem>) :
    RecyclerView.Adapter<CustomAdapterBoard.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding: ListItemBoardBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context), R.layout.list_item_board, parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(boardList[position])
    }

    override fun getItemCount(): Int = boardList.size

    inner class ViewHolder(private val binding: ListItemBoardBinding) :
        RecyclerView.ViewHolder(binding.root) {

        @SuppressLint("SetTextI18n")
        fun bindItems(item: BoardItem) {
            binding.apply {
                imageContent.setImageResource(item.image)
                textTitle.text = item.title
                textDateTime.text = item.dateTime
            }
        }
    }
}