package com.ep.kotlinpractice

// Singleton Pattern
// car factory라는 객체는 car를 만들때만 사용하기 위해서 딱 1번만 생성된다.
// 따라서 불필요한 메모리 소비를 줄일 수 있다.
object CarFactory{
    init{
        println("create car factory")
    }
    val cars = mutableListOf<Car>()
    fun makeCar(horsePower: Int) : Car {
        println("make car : ${horsePower}")
        val car = Car(horsePower)
        cars.add(car)
        return car
    }
}

data class Car(val horsePower : Int){}

fun main(){
    val car = CarFactory.makeCar(10)
    val car2 = CarFactory.makeCar(200)
    println(CarFactory.cars)
}