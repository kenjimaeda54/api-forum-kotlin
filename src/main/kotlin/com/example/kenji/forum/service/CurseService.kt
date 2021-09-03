package com.example.kenji.forum.service

import com.example.kenji.forum.model.Curse
import org.springframework.stereotype.Service

@Service
class CurseService(private var curses: List<Curse>) {

    init {
        val curse1 = Curse(
            id = 1,
            name = "Spring Bot",
            category = "Programação"
        )
        val curse2 = Curse(
            id = 2,
            name = "Spring",
            category = "Programação"
        )
        val curse3 = Curse(
            id = 3,
            name = "Java",
            category = "Programação"
        )
        curses = listOf(curse1, curse2, curse3)
    }

    fun getById(id: Long): Curse {
        return curses.first { it.id == id }
    }


}
