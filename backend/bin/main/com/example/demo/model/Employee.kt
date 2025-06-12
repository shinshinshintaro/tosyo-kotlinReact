package com.example.demo.model

import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
data class Employee(
    @Id
    val id: String,
    val name: String
)
