package com.example.firstassigment

fun main(){

    while(true){
        println("Enter x: ")
        val x = readln().toDouble() //doubleshi imitom gadamyavs, rom yvela sxva numerics asupportebs

        println("Enter y: ")
        val y = readln().toDouble() //aqac magitomaa doubleshi

        val z = x+y
        println("Sum of x and y is: $z")

        println("Do you still want to continue? (Y/N)")
        val ANSWER = readln()

        if(ANSWER == ("Y")) continue
        else {
            println("It was a pleasure to help you out !")
            break}
    }
}


