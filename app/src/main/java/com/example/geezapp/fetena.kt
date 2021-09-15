package com.example.geezapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class fetena : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fetena)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener(){
            val i= Intent(this, quiz1::class.java)
            startActivity(i)
        }
    }
}