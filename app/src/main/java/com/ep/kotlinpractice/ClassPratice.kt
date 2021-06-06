package com.ep.kotlinpractice

fun main(){

    var korean = Korean()
    korean.singASong()
}

// 코틀린의 클래스는 기본적으로 final이다. 따라서 접근을 할 수 없다.
// 따라서 상속을 받고 싶은 class는 open을 명시해줘야한다.
class Korean : Human(){

    // 오버라이딩을 하기위해서는 해당 메서드도 open해줘야 한다.
    override fun singASong(){
        super.singASong()
        println("라라라")
        println("my name is ${name}")
    }

}

open class Human (val name: String = "Anonymous"){

    constructor(name : String, age : Int) : this(name){
        println("my name is ${name},${age} years old")
    }

    // 처음 인스턴스를 생성할 때 어떤 동작을 할 수 있는지 정의해준다.
    // 주 생성자의 일부
    init{
        println("New human has been born!!")
    }

    fun eatingCake(){
        println("This is so YUMMMMY")
    }

    open fun singASong(){
        println("lalala")
    }
}