package com.example.kotlin1

fun main() {
    println("hello world")
    val result = test(10, c= 1)
    println(result)
    test2("kim", "km", "1515")
}

fun times(a: Int, b: Int, ) = a * b
fun test3(a: Int, b: Int) = a+b

fun test2(name: String, nickname: String, id: String) = println(name + nickname + id)

fun test(a: Int, b: Int = 3, c: Int = 5): Int {
    val b = 3
    println(a+b+c)
    return a+b+c
}