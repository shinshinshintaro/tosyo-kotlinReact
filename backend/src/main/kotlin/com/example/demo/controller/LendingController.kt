package com.example.demo.controller

import com.example.demo.service.LendingService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class LendingController(
    private val lendingService: LendingService
) {

    @GetMapping("/lendings")
    fun getLendings(): List<Map<String, String>> {
        return lendingService.getAllLendings().map {
            mapOf("employee" to it.employeeId, "book" to it.bookIsbn)
        }
    }

    @GetMapping("/ranking")
    fun getRanking(): List<Map<String, Any>> {
        return lendingService.getRanking().map {
            mapOf("book" to it.first, "count" to it.second)
        }
    }
}
