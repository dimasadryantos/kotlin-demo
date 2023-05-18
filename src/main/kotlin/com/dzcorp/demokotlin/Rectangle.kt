package com.dzcorp.demokotlin

/**
 * In-heritance between classes is declared by : (Colon)
 * Classes are final by default , we can mark it as open
 *
 */
class Rectangle(var height: Double, var length: Double) : Shape() {
    var parimeter = (height * length) * 2
}