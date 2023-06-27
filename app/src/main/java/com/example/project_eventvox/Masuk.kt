//package com.example.project_eventvox
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//
//class Masuk : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_masuk)
//    }
//
//}
import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.project_eventvox.R
import com.google.android.material.textfield.TextInputEditText

class LoginActivity : AppCompatActivity() {
//    private lateinit var emailEditText: EditText
//    private lateinit var passwordEditText: TextInputEditText
//    private lateinit var loginButton: Button
//
//    @SuppressLint("MissingInflatedId")
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_masuk)
//
//        emailEditText = findViewById(R.id.email)
//        passwordEditText = findViewById(R.id.txtpassword)
//        loginButton = findViewById(R.id.masuk)
//
//        loginButton.setOnClickListener {
//            val email = emailEditText.text.toString()
//            val password = passwordEditText.text.toString()
//
//            if (isValidCredentials(email, password)) {
//                // Proses login berhasil
//                Toast.makeText(this, "Login berhasil", Toast.LENGTH_SHORT).show()
//                // Lakukan tindakan setelah login berhasil
//            } else {
//                // Proses login gagal
//                Toast.makeText(this, "Email atau password salah", Toast.LENGTH_SHORT).show()
//            }
//        }
//    }
//
//    private fun isValidCredentials(email: String, password: String): Boolean {
//        // Implementasikan logika validasi login sesuai dengan kebutuhan Anda
//        // Misalnya, Anda dapat memeriksa dengan panggilan ke API atau menggunakan data statis
//        return email == "admin@example.com" && password == "admin123"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnIntent = findViewById(R.id.masuk)
        btnIntent.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id) {
                R.id.btn_intent -> run {
                    val intentBiasa = Intent(this@MainActivity, IntentKeduaActivity::class.java)
                    startActivity(intentBiasa)
                }
            }
        }
    }
}
