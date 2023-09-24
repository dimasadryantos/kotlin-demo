package com.dzcorp.demokotlin

fun main() {

    val names = arrayOf("dimas", "charlote", "laura")



    println(names[0])
    names[0] = "Bella"
    println(names.contentToString())


    if("laura" in names){
        println("valid name")
    }else {
        println("Invalid name")
    }
}




