package com.dzcorp.demokotlin

fun main() {
    val name = "dimas"
    val name2 = "samid"
    val name3 = String("dimas".toCharArray())


    println(name == name3)
    println(name.equals(name3))
    println(name === name3)


    //Both for == or equals are comparing the contents in kotlin
    //in Java == is comparing memory location, in kotlin we can use === (triple equals)
    //val name2 = "samid" will be store in string pool
    //val name3 = String("dimas".toCharArray()) will be store in heap
}