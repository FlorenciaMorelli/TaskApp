package com.example.taskapp

import com.example.taskapp.data.Task

//  Protocolo que vamos a definir para las acciones que vamos a poder hacer con nuestros objetos

interface TaskActions {
    fun addTask(task: Task)
    fun removeTask(task: Task)
}