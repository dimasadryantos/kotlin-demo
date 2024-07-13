package com.dzcorp.demokotlin

fun main(args: Array<String>) {
}


fun forLoopKotlin() {
    val fruits = listOf("banana", "aple", "kiwi")

    for (fruit in fruits) {
        println(fruit)
    }
}

fun forLoopWithIndex() {
    val fruits = listOf("banana", "apple", "kiwi")

    for (fruit in fruits.indices) {
        println("item at $fruit is ${fruits[fruit]}")
    }
}

fun loopWithAny(): Boolean {
    val circles = listOf(Circle("RETURN"), Circle("NOT_RETURN"))

    val found = circles.any() {
        (it.type == "RETURN")
    }

    return found
}
