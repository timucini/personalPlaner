package com.example.personalplaner.models.shopping

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.personalplaner.models.ShoppingCategory
import java.util.*

@Entity
data class ShoppingList(
    @PrimaryKey val uid: Int,
    var shoppingItems: List<ShoppingItem>,
    var category: ShoppingCategory,
    var created: Date,
    var dueDate: Date?
)