package com.example.kotlin1

//타입체크 및 캐스팅
fun main() {
    /*println(check("HEllo"))
    println(check(5))
    println(check(true))*/

    cast("a")
    cast(1)

    println(smartcast("abcdefg"))
    println(smartcast(10))
    println(smartcast(true))
}

fun check(a: Any): String {
    return when (a) {
        is String -> {
            "String"
        }

        is Int -> {
            "Int"
        }

        else -> {
            "I don't know"
        }
    }
}

fun cast(a: Any) {
    val result = (a as? String) ?: "fail" // a를 문자열로 받음 ?를 사용한 경우 문자열이 아니면 null로 받음
    println(result)
}

fun smartcast(a: Any): Int {
    return when (a) {
        is String -> {
            a.length // 문자열일 경우 글자수를 반환
        }

        is Int -> {
            a.dec() //숫자열일경우 값에 -1을 함
        }

        else -> {
            -1
        }
    }
}