package com.example.personalplaner.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.personalplaner.R
import com.example.personalplaner.viewModel.ShoppingViewModel

/**
 * A fragment representing a list of Items.
 */
class ShoppingListFragment : Fragment() {

    private val model: ShoppingViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_item_list, container, false)

        // Set the adapter
        if (view is RecyclerView) {
            with(view) {
                layoutManager = LinearLayoutManager(context)
                adapter = ShoppingListRecyclerViewAdapter(model.testTodoList)
            }
        }
        return view
    }

}