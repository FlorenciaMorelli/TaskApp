package com.example.taskapp.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.taskapp.databinding.ItemTaskBinding

class TaskViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val binding = ItemTaskBinding.bind(view)
}