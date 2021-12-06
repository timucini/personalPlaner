package com.example.personalplaner.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.personalplaner.models.*
import com.example.personalplaner.models.shopping.ShoppingItem
import com.example.personalplaner.models.shopping.ShoppingList
import java.util.*

class ShoppingViewModel: ViewModel() {
    val toDoCategory1 =  ShoppingCategory(1,"Shopping", "Grocery" )
    val todoItem1 = ShoppingItem(1,"Apples",2)
    var testTodoList: ShoppingList = ShoppingList(1,listOf(todoItem1),toDoCategory1,Calendar.getInstance().time,null)

    fun addTodoItem(itemName: String, amount: String) {
        //val toDoItemToAdd = ToDoItemWithAmount(itemName,amount)
        Log.d("Test123","$itemName , $amount")
    }
}