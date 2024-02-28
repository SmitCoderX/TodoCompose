package com.smitcoderx.learn.todocleanarchitecture.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.smitcoderx.learn.todocleanarchitecture.ui.theme.BabyBlue
import com.smitcoderx.learn.todocleanarchitecture.ui.theme.LightBlue
import com.smitcoderx.learn.todocleanarchitecture.ui.theme.LightGreen
import com.smitcoderx.learn.todocleanarchitecture.ui.theme.RedOrange
import com.smitcoderx.learn.todocleanarchitecture.ui.theme.RedPink
import com.smitcoderx.learn.todocleanarchitecture.ui.theme.Violet

@Entity
data class Note(
    val title: String,
    val content: String,
    val timeStamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColor = listOf(RedOrange, LightGreen, LightBlue, RedPink, BabyBlue, Violet)
    }
}


class InvalidNoteException(message: String) : Exception(message)