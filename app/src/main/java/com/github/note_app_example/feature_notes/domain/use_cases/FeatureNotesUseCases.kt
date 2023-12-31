package com.github.note_app_example.feature_notes.domain.use_cases

data class FeatureNotesUseCases(
    val getAllNotes: GetAllNotes,
    val deleteNote: DeleteNote,
    val addNote: AddNote,
    val getNote: GetNote
)
