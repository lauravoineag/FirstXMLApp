package com.example.firstxmlapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.firstxmlapp.R.id.text_pica


class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val newText = findViewById<TextView>(text_pica)
        newText.setOnClickListener { newText.text = "I have been clicked too" }


        val button = findViewById<Button>(R.id.my_button)
        button.setOnClickListener { button.text = "I have been clicked" }


        var count = 0
        var countButton = findViewById<Button>(R.id.button_count)
        countButton.setOnClickListener {
            count++
            findViewById<TextView>(R.id.text_counting).text = "Let's count together: $count"
        }
    }
}