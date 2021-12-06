package com.example.personalplaner.repository

import com.example.personalplaner.models.shopping.ShoppingList

interface ShoppingListRepository {
    fun getAll() : List<ShoppingList>
}