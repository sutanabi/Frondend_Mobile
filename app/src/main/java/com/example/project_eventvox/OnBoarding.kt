package com.example.project_eventvox

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class OnBoarding : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboarding)


        btnToLogin()
        btnRegis()
    }



    private fun btnToLogin() {
        val masuk = findViewById<Button>(R.id.masuk)
        masuk.setOnClickListener {
            startActivity(Intent(this, Masuk::class.java))
        }
    }
    private fun btnRegis() {
        val regis = findViewById<Button>(R.id.regis)
        regis.setOnClickListener {
            startActivity(Intent(this, Daftar::class.java))
        }
    }
}