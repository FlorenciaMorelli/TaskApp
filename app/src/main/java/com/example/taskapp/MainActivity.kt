package com.example.taskapp

import android.app.Activity
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.taskapp.adapter.TaskAdapter
import com.example.taskapp.data.Task
import com.example.taskapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var recycler: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val tasks = TaskManager.getTasks()
        initComponent(tasks)

    }

    fun initComponent(tasks: List<Task>){
        recycler = binding.recyclerView
        recycler.adapter = TaskAdapter(tasks)
        recycler.layoutManager = LinearLayoutManager(this)
    }
}