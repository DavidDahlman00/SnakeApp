package com.example.snakeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView

class SnakeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snake)
        val gameBord = findViewById<GridView>(R.id.game_bord)
        val bord = Bord()
        val adapter = ImageListAdapter(this, R.layout.item_list, bord.bord)
        gameBord.adapter = adapter
    }
}