package com.github.note_app_example.feature_notes.presentation.add_edit_note_screen

data class NoteTextFieldState(
    val text: String = "",
    val hint: String = "",
    val isHintVisible: Boolean = true
)