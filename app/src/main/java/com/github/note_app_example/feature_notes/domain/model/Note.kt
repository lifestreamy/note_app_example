package com.github.note_app_example.feature_notes.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.github.note_app_example.ui.theme.DarkPastelGreen
import com.github.note_app_example.ui.theme.GoldMetallic
import com.github.note_app_example.ui.theme.ImperialRed
import com.github.note_app_example.ui.theme.LightOrange
import com.github.note_app_example.ui.theme.Verdigris

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        //        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
        val noteColors = listOf(ImperialRed, Verdigris, GoldMetallic, DarkPastelGreen, LightOrange)
    }
}

class InvalidNoteException(message: String) : Exception(message)
