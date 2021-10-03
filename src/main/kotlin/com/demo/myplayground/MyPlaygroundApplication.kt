package com.demo.myplayground

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MyPlaygroundApplication

fun main(args: Array<String>) {
    runApplication<MyPlaygroundApplication>(*args)
}
