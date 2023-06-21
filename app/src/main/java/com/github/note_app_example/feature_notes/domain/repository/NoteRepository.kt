package com.github.note_app_example.feature_notes.domain.repository

import com.github.note_app_example.feature_notes.domain.model.Note
import kotlinx.coroutines.flow.Flow

interface NoteRepository {

    fun getAllNotes() : Flow<List<Note>>

    suspend fun getNoteById(id :Int) : Note?

    suspend fun insertNote(note : Note)

    suspend fun deleteNote(note : Note)
}