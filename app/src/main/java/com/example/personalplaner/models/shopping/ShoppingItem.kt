package com.example.personalplaner.models.shopping

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ShoppingItem(
    @PrimaryKey val uid: Int,
    var itemName: String,
    var amount: Int
)
