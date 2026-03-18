package com.example.kotlin1

//String template -> 로그 찍을때 유용
fun main() {
    val a = 10
    val name = "kim"
    val isHigh = true

    //자바식
    println(a.toString() + name.length + isHigh.toString())

    //코틀린식
    println("$a ${name.length} $isHigh")
}