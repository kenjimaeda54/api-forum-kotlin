package com.example.kenji.forum.service

import com.example.kenji.forum.dto.NewTopicDto
import com.example.kenji.forum.model.Curse
import com.example.kenji.forum.model.Topic
import com.example.kenji.forum.model.AuthorUser
import org.springframework.stereotype.Service

@Service
class TopicsService(
    private var topics: List<Topic>,
    private var curseService: CurseService,
    private var authorService: AuthorService
) {


    fun list(): List<Topic> {
        return topics
    }

    fun getById(id: Long): Topic {
        return topics.first { it.id == id }
    }

    fun create(dto: NewTopicDto) {
        topics = topics.plus(
            Topic(
                id = topics.size.toLong() + 1,
                title = dto.title,
                message = dto.message,
                curse = curseService.getById(dto.idCurse),
                author = authorService.getById(dto.idAuthor),

                )
        )
    }

}