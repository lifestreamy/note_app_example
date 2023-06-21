package com.github.note_app_example.feature_notes.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.github.note_app_example.feature_notes.domain.model.Note

@Database(
    entities = [Note::class],
    version = 1
)
abstract class NoteDatabase : RoomDatabase() {

    abstract val noteDao : NoteDao
}