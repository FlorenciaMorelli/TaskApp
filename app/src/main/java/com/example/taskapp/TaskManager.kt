package com.example.taskapp

import com.example.taskapp.data.Task

//  Desacoplar el codigo de la app, desmenuzarlo y permitir que este objeto (manager) implemente la interfaz
object TaskManager:TaskActions {

    private val tasks = mutableListOf<Task>(
        Task(
            1,
            "Estudiar",
            "Preparar examen para la facultad"
        ),
        Task(
            2,
            "Pintar la habitación",
            "Comprar pintura esta semana"
        )
    )

    override fun addTask(task: Task) {
        tasks.add(task)
    }

    override fun removeTask(task: Task) {
        tasks.remove(task)
    }

    fun getTasks():List<Task>{
        return tasks
    }
}