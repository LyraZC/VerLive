package com.example.verlive.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.example.verlive.R
import com.example.verlive.databinding.ActivityMenuBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class Activity_menu : AppCompatActivity() {
    private lateinit var binding:ActivityMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val menuarte: BottomNavigationView = binding.bottomNavMenu
        setupWithNavController(menuarte, Navigation.findNavController(this, R.id.frag_navgraph)
        )


    }
}