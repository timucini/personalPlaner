package com.example.personalplaner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.personalplaner.databinding.ActivityMainBinding
import com.example.personalplaner.databinding.DialogAddTodoItemWithAmountBinding
import com.example.personalplaner.viewModel.ShoppingViewModel
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val model: ShoppingViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController
        val bottomNavigationView: BottomNavigationView = binding.bottomNavigation
        bottomNavigationView.setupWithNavController(navController)
        binding.btnAdd.setOnClickListener {
            val dialogBinding : DialogAddTodoItemWithAmountBinding =
                       DialogAddTodoItemWithAmountBinding.inflate(layoutInflater)
            val itemName = dialogBinding.eTItemTitle
            val itemAmount = dialogBinding.etItemAmount

            MaterialAlertDialogBuilder(this)
                .setView(dialogBinding.root)
                .setTitle(R.string.dialog_title)
                .setNeutralButton(R.string.dialog_btn_neutral_label) { _, _ -> }
                .setPositiveButton(R.string.dialog_btn_positive_label) { dialogInterface, i ->
                    model.addTodoItem(
                        itemName.text.toString(),
                        itemAmount.text.toString()
                    )
                }
                .show()
        }

    }
}