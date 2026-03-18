package com.example.kotlin1


fun main() {
    val user = User("kim", 27)
    println(user.name)
    println(user.age)
    val kid = Kid("kym", 5, "female")
}

//클래스 상속할때 open을 붙여야 상속이 가능함
open class User(open val name : String, open var age : Int = 0)

class Kid(override val name: String, override var age: Int) : User(name, age) {
    var gender: String = "male"
    
    init {
        println("reboot")
    }

    //2차 생성자
    constructor(name: String, age: Int, gender: String) : this(name, age){
        this.gender = gender
        println("second")
    }
}