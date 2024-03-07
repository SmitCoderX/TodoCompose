package com.smitcoderx.learn.todocleanarchitecture.feature_note.domain.util

import androidx.compose.runtime.Composable


sealed class Screen(val route: String) {

    object NotesScreen: Screen("notes_screen")
    object AddEditNoteScreen: Screen("add_edit_note_screen")

}