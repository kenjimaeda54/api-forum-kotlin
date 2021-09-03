package com.example.kenji.forum.controller

import com.example.kenji.forum.dto.NewTopicDto
import com.example.kenji.forum.model.Topic
import com.example.kenji.forum.service.TopicsService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/topics")
class TopicsController(val service: TopicsService) {

    @GetMapping
    fun list(): List<Topic> {
        return service.list()
    }

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long): Topic {
        return service.getById(id)
    }

    @PostMapping
    //nao e ideal mandar os modelos e retornar , as classes de modelo ou intidades do banco precisam ser preservadas
    //para isto cria um modelo dto
    fun create(@RequestBody dto: NewTopicDto) {
        service.create(dto)
    }
}