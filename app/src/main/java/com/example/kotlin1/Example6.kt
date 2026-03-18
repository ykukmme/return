package com.example.kotlin1

//list, map, set
fun main() {
    //코틀린에서는 값이 변경 가능한 리스트와 불가능한 리스트가 있음

    //변경 가능하게 만들거면 mutableListOf()
    val list = mutableListOf(1,2,3,4,5)
    list.add(6)

    list[0]

    val list2 = listOf(1,2,3,4)
    list2[0]

    //list2.map{it * 10}.joinToString("/") -> 리스트 요소에 10씩 곱하고 구분자로 /
    println(list2.map{it * 10}.joinToString("/"))

    val diverseList = listOf(1, "안녕", 1.78, false)

    println(list.joinToString(","))

    val map = mapOf((1 to "Hello"), (2 to "Hi"))
    val map2 = mutableMapOf((1 to "Hello"), (2 to "Hi"))
    map2[3] = "yes"
    map2[4] = "no"
}