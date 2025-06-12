package com.example.demo.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
data class Lending(
    @Id @GeneratedValue
    val id: Long = 0,
    val employeeId: String,
    val bookIsbn: String
)
