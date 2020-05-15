package com.rajesh.kotlin.springbootkotlin.controller

import com.rajesh.kotlin.springbootkotlin.model.Greet
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class GreetController {
    val counter = AtomicLong()

    @GetMapping("/greeting/{name}")
    fun greet(@PathVariable name: String) = Greet(counter.incrementAndGet(), "Hello ${name}")
}
