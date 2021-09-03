package com.example.kenji.forum.model

import java.time.LocalDateTime

data class Response(
    val id: Long?,
    val name: String,
    val dateCreate: LocalDateTime = LocalDateTime.now(),
    val author: String,
    val topic: String,
    val solution: Boolean
)
