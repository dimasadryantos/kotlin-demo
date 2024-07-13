package com.dzcorp.demokotlin

//String templates
fun stringTemplate(): Unit {
    var a = 1
    val s = "a is $a"

    val s2 = "${s.replace("is", "was")}"
    println(s2)
}