package com.ep.kotlinpractice

// 1. Lambda
// 람다식은 우리가 마치 value 처럼 다룰 수 있는 익명함수이다.
// 1) 메서드의 파라미터로 넘겨줄수가 있다.
// 2) return 값으로 사용할 수 있다.

// 람다 기본정의
// val lambdaName : Type = {arguments -> codeBody}
// 타입 추론이 가능하도록 작성해야 한다.
val square : (Int) -> (Int) = {number -> number*number}
//val square = {number : Int -> number*number}

val nameAge : (String,Int) -> (String) = {name,age -> "my name is ${name} I'm ${age}"}
//val nameAge = {name:String,age:Int -> "my name is ${name} I'm ${age}"}

fun main(){
    val a = "ep said"
    val b = "mac said"
    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())

    println(extendString("ariana",27))
    println(calculateGrade(97))
    println(calculateGrade(971))


    val lambda = {number : Double ->
        number == 4.3213
    }

    println(invokeLambda(lambda))
    println(invokeLambda({it > 3.22}))
    // 소괄호 생략 가능
    println(invokeLambda{it > 3.22})




}

// 확장 함수
// 기존에 있는 String 클래스에 메서드를 추가하는 개념이다.
val pizzaIsGreat : String.() -> String = {
    this + "Pizza is the best!"
}

fun extendString(name:String, age:Int) : String {

    // this는 해당 메서드를 사용하는 객체이다.
    // 파라미터가 1개일 경우 예약어 it을 써줄 수 있다.
    val introduceMyself : String.(Int) -> String = {"I am ${this} and ${it} years old"}
    return name.introduceMyself(age)
}

// 람다의 Return
// 람다는 마지막 표현식이 return 값을 의미한다.
val calculateGrade : (Int) -> String = {
    // 해당 람다식은 꼭 String 을 반환해줘야 하기 때문에 else를 명시해줘야 한다.
    when(it) {
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfect"
        else -> "Error"
    }
}


// 람다를 표현하는 여러가지 방법
fun invokeLambda(lambda : (Double) -> Boolean) : Boolean{
    return lambda(5.2343)
}

// Data Class
// 비어있는 틀 역할을 하는 클래스를 POJO 클래스라고 한다. 딱히 그 안에 메서드가 있지 않는 클래스다.
// DTO에 가깝다고 생각하면 된다.
// Kotlin은 이 클래스를 작성하는 것이 불필요하다고 판단했다. 그래서 Data Class를 만들어줬다.