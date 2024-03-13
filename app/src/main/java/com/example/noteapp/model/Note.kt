package com.example.noteapp.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.Instant
import java.util.Date
import java.util.UUID

@Entity(tableName = "notes_tbl")
data class Note (

    @PrimaryKey
    val id : UUID = UUID.randomUUID(), //98dfas-...

    @ColumnInfo(name = "note_title")
    val title : String,

    @ColumnInfo(name = "note_description")
    val description : String,
    //val entryDate : LocalDateTime = LocalDateTime.now()

    @ColumnInfo(name = "note_entry_date")
    val entryDate : Date = Date.from(Instant.now())
)
