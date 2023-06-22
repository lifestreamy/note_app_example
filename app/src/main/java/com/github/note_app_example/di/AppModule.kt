package com.github.note_app_example.di

import android.app.Application
import androidx.room.Room
import com.github.note_app_example.feature_notes.data.data_source.NoteDatabase
import com.github.note_app_example.feature_notes.data.repository.NoteRepositoryImpl
import com.github.note_app_example.feature_notes.domain.repository.NoteRepository
import com.github.note_app_example.feature_notes.domain.use_cases.DeleteNote
import com.github.note_app_example.feature_notes.domain.use_cases.FeatureNotesUseCases
import com.github.note_app_example.feature_notes.domain.use_cases.GetAllNotes
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideNoteDatabase(app: Application): NoteDatabase {
        return Room.databaseBuilder(
            app, NoteDatabase::class.java, NoteDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db: NoteDatabase): NoteRepository = NoteRepositoryImpl(db.noteDao)

    @Provides
    @Singleton
    fun provideNoteUseCases(repository: NoteRepository): FeatureNotesUseCases {
        return FeatureNotesUseCases(
            getAllNotes = GetAllNotes(repository),
            deleteNote = DeleteNote(repository)
        )
    }

}