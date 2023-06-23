package com.github.note_app_example.feature_notes.domain.use_cases

import com.github.note_app_example.feature_notes.domain.model.InvalidNoteException
import com.github.note_app_example.feature_notes.domain.model.Note
import com.github.note_app_example.feature_notes.domain.repository.NoteRepository

class AddNote(private val repository : NoteRepository) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note){
            if(note.title.isBlank()){
                throw InvalidNoteException(message = "The title of the note can not be blank")
            }
            if(note.content.isBlank()){
                throw InvalidNoteException("Add the description for the note")
            }
        repository.insertNote(note)
    }
}