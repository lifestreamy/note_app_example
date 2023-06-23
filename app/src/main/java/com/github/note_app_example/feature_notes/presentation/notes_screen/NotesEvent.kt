package com.github.note_app_example.feature_notes.presentation.notes_screen

import com.github.note_app_example.feature_notes.domain.model.Note
import com.github.note_app_example.feature_notes.domain.util.NoteOrder

sealed class NotesEvent{
    data class Order(val noteOrder: NoteOrder) : NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    object RestoreNote : NotesEvent()
    object ToggleOrderSection : NotesEvent()

}
