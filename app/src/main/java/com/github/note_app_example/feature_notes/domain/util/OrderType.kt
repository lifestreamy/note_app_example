package com.github.note_app_example.feature_notes.domain.util

sealed class OrderType{
    object Ascending: OrderType()
    object Descending: OrderType()
}