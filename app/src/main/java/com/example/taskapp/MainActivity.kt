package com.example.taskapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.taskapp.adapter.TaskAdapter
import com.example.taskapp.data.Task
import com.example.taskapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var recycler: RecyclerView
    private var auxiliarForTask = 2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val tasks = TaskManager.getTasks()
        initComponent(tasks)
        btnSetOnClickListener()

    }

    fun initComponent(tasks: List<Task>){
        recycler = binding.recyclerView
        recycler.adapter = TaskAdapter(tasks)
        recycler.layoutManager = LinearLayoutManager(this)
    }

    fun btnSetOnClickListener(){
        binding.btnAddTask.setOnClickListener{
            val task = generateTask()
            TaskManager.addTask(task)
            recycler.adapter?.notifyDataSetChanged()
        }
    }

    private fun generateTask(): Task {
        auxiliarForTask += 1
        return Task(
            auxiliarForTask,
            "Título default",
            "Descripción default"
        )
    }

}