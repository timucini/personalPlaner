package com.example.personalplaner.db.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.personalplaner.models.shopping.ShoppingList

@Dao
interface ShoppingListDao {
    @Query("SELECT * FROM shoppingList")
    fun getAll() : List<ShoppingList>

    @Query("SELECT * FROM shoppingList WHERE uid IN (:listIds)")
    fun loadAllByIds(listIds: IntArray): List<ShoppingList>

    @Insert
    fun insertAll(vararg shoppingLists: ShoppingList)

    @Delete
    fun delete(shoppingList: ShoppingList)
}