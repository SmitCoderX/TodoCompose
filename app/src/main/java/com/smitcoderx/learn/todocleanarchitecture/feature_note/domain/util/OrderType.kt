package com.smitcoderx.learn.todocleanarchitecture.feature_note.domain.util

sealed class OrderType {
    object Ascending : OrderType()
    object Descending : OrderType()
}