package com.dzcorp.demokotlin

//Basic variable in kotlin

val outsideVariable: Int = 5

fun varTest(): Unit {

    //Read-only local variable
    val a: Int = 1
    val b = 1
    val c: Int
    c = 4

    //Variables that can be assigned
    var x: Int = 2
    x += 4
    println("Variable x is :  $x")
    println("Outisde variable is : $outsideVariable")
}