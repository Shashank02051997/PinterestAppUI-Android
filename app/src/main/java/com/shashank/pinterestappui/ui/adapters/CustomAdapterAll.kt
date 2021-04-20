package com.shashank.pinterestappui.ui.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.shashank.pinterestappui.R
import com.shashank.pinterestappui.data.model.BoardItem
import com.shashank.pinterestappui.databinding.ListItemAllBinding

class CustomAdapterAll(private val allList: ArrayList<Int>) :
    RecyclerView.Adapter<CustomAdapterAll.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding: ListItemAllBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context), R.layout.list_item_all, parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(allList[position])
    }

    override fun getItemCount(): Int = allList.size

    inner class ViewHolder(private val binding: ListItemAllBinding) :
        RecyclerView.ViewHolder(binding.root) {

        @SuppressLint("SetTextI18n")
        fun bindItems(item: Int) {
            binding.apply {
                imageContent.setImageResource(item)
            }
        }
    }
}