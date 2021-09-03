package com.example.kenji.forum.model


import java.time.LocalDateTime

data class Topic(
    val id: Long? = null,
    val title: String,
    val message: String,
    val dateCreate: LocalDateTime = LocalDateTime.now(),
    val curse: Curse,
    val author: AuthorUser,
    val status: StatusTopic = StatusTopic.NAO_RESPONDIDO,
    val response: ArrayList<String> = arrayListOf()
)


