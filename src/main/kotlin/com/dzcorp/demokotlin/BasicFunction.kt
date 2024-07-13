package com.dzcorp.demokotlin

//Basic function in Kotlin
fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int) = a + b


fun sum3(a: Int, b: Int): Unit {
    println("Sum of $a and $b is ${a + b}")
}