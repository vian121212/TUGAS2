package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val button = findViewById<Button>(R.id.btnlupapass)

        button.setOnClickListener{
            val intent = Intent(this, LupaPassActivity::class.java)
            startActivity(intent)
        }
    }
}