package com.example.noteapp.data

import com.example.noteapp.model.Note

class NotesDataSource {
    fun loadNotes(): List<Note>{
        return listOf(
            Note(title = "AAAAAAAAA", description = "aaaaaaaa"),
            Note(title = "BBBBBBBBB", description = "bbbbbbbb"),
            Note(title = "CCCCCCCCC", description = "cccccccc"),
            Note(title = "DDDDDDDDD", description = "dddddddd"),
            Note(title = "EEEEEEEEE", description = "eeeeeeee"),
            Note(title = "FFFFFFFFF", description = "ffffffff")
        )
    }
}