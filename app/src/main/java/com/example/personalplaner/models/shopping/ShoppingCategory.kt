package com.example.personalplaner.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ShoppingCategory(
    @PrimaryKey val uid: Int,
    val topCategory: String,
    val name: String
    )