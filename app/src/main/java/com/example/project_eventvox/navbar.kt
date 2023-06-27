package com.example.project_eventvox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class navbar : AppCompatActivity() {
//    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navbar)

//        val navHostFragment = supportFragmentManager.findFragmentById(R.id.mainContainer) as NavHostFragment
//        navController = navHostFragment.navController
//        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
//        setupWithNavController(bottomNavigationView , navController)
    }
}