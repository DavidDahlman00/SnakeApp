package com.example.snakeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var difficulty : String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val easy_button = findViewById<Button>(R.id.easy_button)
        difficulty = "easy"
        easy_button.setOnClickListener {
            startSnakeActivity()
        }
    }
     private fun startSnakeActivity(){
        val intent = Intent(this, SnakeActivity::class.java)
        intent.putExtra("difficulty", difficulty)
        startActivity(intent)
    }
}