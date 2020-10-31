package com.example.snakeapp

class Position (private val pos : Int, val x : Int = pos % 12, val y : Int = pos / 12){
    fun getUp(){

    }
    fun getDown(){

    }
    fun getLeft(){

    }
    fun getRight(){

    }
    fun getPos() : Int{
        return pos
    }
}