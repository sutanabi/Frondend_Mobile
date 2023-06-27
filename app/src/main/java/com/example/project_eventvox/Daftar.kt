//package com.example.project_eventvox
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//
//class Daftar : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_daftar)
//    }
//}
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.project_eventvox.R
import okhttp3.*
import java.io.IOException
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    private lateinit var usernameEditText: EditText
    private lateinit var passwordEditText: TextInputEditText
    private lateinit var emailEditText: EditText
    private lateinit var submitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        usernameEditText = findViewById(R.id.nama)
        passwordEditText = findViewById(R.id.txtpassword)
        emailEditText = findViewById(R.id.email)
        submitButton = findViewById(R.id.regis)

        submitButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()
            val email = emailEditText.text.toString()

            val client = OkHttpClient()

            val formBody = FormBody.Builder()
                .add("username", username)
                .add("password", password)
                .add("email", email)
                .build()

            val request = Request.Builder()
                .url("http://example.com/register.php") // Ganti dengan URL API Anda
                .post(formBody)
                .build()

            client.newCall(request).enqueue(object : Callback {
                override fun onFailure(call: Call, e: IOException) {
                    // Menangani kegagalan permintaan
                    runOnUiThread {
                        println("Gagal melakukan permintaan API: ${e.message}")
                    }
                }

                override fun onResponse(call: Call, response: Response) {
                    response.body()?.let { responseBody ->
                        val json = responseBody.string()

                        // Menangani respons JSON
                        // Misalnya, memeriksa apakah registrasi berhasil atau tidak

                        runOnUiThread {
                            println("Respon API: $json")
                        }
                    }
                }
            })
        }
    }
}
