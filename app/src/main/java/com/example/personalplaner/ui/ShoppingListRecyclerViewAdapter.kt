package com.example.personalplaner.ui

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import com.example.personalplaner.databinding.FragmentItemBinding
import com.example.personalplaner.models.shopping.ShoppingList

class ShoppingListRecyclerViewAdapter(
    private val values: ShoppingList
) : RecyclerView.Adapter<ShoppingListRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            FragmentItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values.shoppingItems[position]
        holder.text.text = item.itemName
        holder.amount.text = item.amount.toString()
    }

    override fun getItemCount(): Int = values.shoppingItems.size

    inner class ViewHolder(binding: FragmentItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val text: TextView = binding.tvItem
        val amount: TextView = binding.tvAmount

    }

}