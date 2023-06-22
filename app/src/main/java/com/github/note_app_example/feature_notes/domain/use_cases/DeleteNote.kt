package com.github.note_app_example.feature_notes.domain.use_cases

import com.github.note_app_example.feature_notes.domain.model.Note
import com.github.note_app_example.feature_notes.domain.repository.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(note: Note) = repository.deleteNote(note)
}