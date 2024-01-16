package com.example.firstxmlapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val newText = findViewById<TextView>(R.id.text_view_id)
            newText.setOnClickListener{
                newText.text= "I have been clicked too"
        }

        val button = findViewById<Button>(R.id.mybutton)
        button.setOnClickListener{
            button.text= "I have been clicked"
        }
    }
}