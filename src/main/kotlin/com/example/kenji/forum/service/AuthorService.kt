package com.example.kenji.forum.service

import com.example.kenji.forum.model.AuthorUser
import org.springframework.stereotype.Service

@Service
class AuthorService(private var authors: List<AuthorUser>) {
    init {
        val author1 = AuthorUser(
            id = 1,
            name = "Ricardo",
            email = "kenji@gmail"
        )
        val author2 = AuthorUser(
            id = 2,
            name = "Raf",
            email = "kenji@gmail"
        )
        val author3 = AuthorUser(
            id = 3,
            name = "Mathe",
            email = "kenji@gmail"
        )

        authors = listOf(author1, author2, author3)
    }

    fun getById(id: Long): AuthorUser {
        return authors.first { it.id == id }
    }

}
