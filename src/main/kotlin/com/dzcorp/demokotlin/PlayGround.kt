package com.dzcorp.demokotlin

fun main(args: Array<String>) {

    classFunction()

}

//class in kotlin

fun classFunction(): Unit {
    val rectangle = Rectangle(2.0, 3.0)

    println("The parimeter is ${rectangle.parimeter}")
}


//Basic function in Kotlin
fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int) = a + b


fun sum3(a: Int, b: Int): Unit {
    println("Sum of $a and $b is ${a + b}")
}

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








