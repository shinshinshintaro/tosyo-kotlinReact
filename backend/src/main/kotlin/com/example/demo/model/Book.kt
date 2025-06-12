package com.example.demo.model

import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
data class Book(
    @Id
    val isbn: String,
    val title: String
)
