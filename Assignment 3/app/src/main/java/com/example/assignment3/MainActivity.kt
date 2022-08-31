package com.example.assignment3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val registerActivitybutton = findViewById<Button>(R.id.btn_register)
        registerActivitybutton.setOnClickListener{
            val intent = Intent(this,RegisterActivity::class.java)
            startActivity(intent)

        }
    }
}