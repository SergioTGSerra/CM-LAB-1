package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AT1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_at1)

        val button = findViewById<Button>(R.id.go_act_2)
        button.setOnClickListener {
            val intent = Intent(this, AT2::class.java)
            startActivity(intent)
        }

    }
}