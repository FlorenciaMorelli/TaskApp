package com.example.taskapp.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.taskapp.data.Task
import com.example.taskapp.databinding.ItemTaskBinding

class TaskViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val binding = ItemTaskBinding.bind(view)

    fun bind(task: Task){
        binding.taskId.text = task.id.toString()
        binding.taskTitle.text = task.title
        binding.taskDescription.text = task.description
    }
}