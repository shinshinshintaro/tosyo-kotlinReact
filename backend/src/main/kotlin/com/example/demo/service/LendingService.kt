package com.example.demo.service

import com.example.demo.model.Lending
import org.springframework.stereotype.Service

@Service
class LendingService {
    fun getAllLendings(): List<Lending> {
        // 本来はDBから取得
        return listOf(
            Lending(employeeId = "1234", bookIsbn = "978-3-16-148410-0"),
            Lending(employeeId = "5678", bookIsbn = "978-4-06-293842-6")
        )
    }

    fun getRanking(): List<Pair<String, Int>> {
        return listOf(
            "Effective Java" to 5,
            "Clean Code" to 3
        )
    }
}
