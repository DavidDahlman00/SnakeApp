package com.example.snakeapp

class Bord() {
    var bord = mutableListOf<Position>()
    var snake = mutableListOf<Position>()

    init {
        makeBord()
        makeSnake()
    }

    fun makeBord(){
        for (i in 0..4095){
            bord.add(Position(i))
        }
    }

    fun makeSnake(){

    }
}