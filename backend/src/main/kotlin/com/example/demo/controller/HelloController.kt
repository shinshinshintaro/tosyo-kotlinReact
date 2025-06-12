package com.example.demo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @GetMapping("/api/greeting")
    fun greeting(): Map<String, String> {
        return mapOf("message" to "Hello, World from Spring Boot!")
    }
}
