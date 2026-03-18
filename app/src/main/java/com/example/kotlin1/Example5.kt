package com.example.kotlin1

//반복문
fun main() {
    //for (int i = 1; i < 11; i++) {} -> 자바의 반복문

    //1~10까지
    for (i in IntRange(1, 10)) { //1..10 = IntRange(1, 10)
        print(i)
        print(",")
    }

    println()

    for (i in 1 until 10 step(2)) {
        print(i)
        print(",")
    }

    println()

    for (i in 10 downTo 1) { //점차 작아지는 반복문을 쓸경우 downTo 사용
        print(i)
        print(",")
    }

    println()

    for (i in 10 downTo 1 step(2)) { //점차 작아지는 반복문을 쓸경우 downTo 사용
        print(i)
        print(",")
    }

    println()

    var  a = 1
    while (a < 11) {
        print(a)
        print(",")
        a++
    }

}