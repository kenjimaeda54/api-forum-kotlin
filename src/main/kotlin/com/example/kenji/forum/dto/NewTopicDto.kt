package com.example.kenji.forum.dto

data class NewTopicDto(
    val title: String,
    val message: String,
    val idCurse: Long,
    val idAuthor: Long,
)
