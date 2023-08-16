package com.project.todoskotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TodosKotlinApplication

fun main(args: Array<String>) {
    runApplication<TodosKotlinApplication>(*args)
}
