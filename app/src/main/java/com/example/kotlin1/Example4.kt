package com.example.kotlin1

import java.time.DayOfWeek

fun main() {
    max(10, 17)
    isHoliday("목")
    isHoliday("토")
}

fun max(a: Int, b: Int) {
    //자바의 방식
    /*if (a > b) {
        println(a)
    } else {
        println(b)
    }*/

    //코틀린의 방식
    val result = if (a>b) {
        a
    } else {
        b
    }
    println(result)
    
    val result2 = if (a>b) a else b //코틀린에서 3항연산자처럼 하는 방법
    println(result2)
}

//일월화수목금토일
fun isHoliday(dayOfWeek: Any) { //Any -> 어떤 타입이든 가능
    //자바에서의 switch문
    val result = when(val day = dayOfWeek) {
        "토",
        "일" -> if (day == "토") "Saturday" else "Sunday" //조건이 같은것이 적용될 시 ,로 묶을수 있음
        else -> false//default
    }
    println(result)
}