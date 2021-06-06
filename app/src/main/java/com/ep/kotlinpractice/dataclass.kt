package com.ep.kotlinpractice

// 클래스의 프로퍼티 처럼 사용할 수 있다.
// toString(), constructor(), hashcode(), equals(), copy()가 생성된다.
data class Ticket(val companyName : String, val name : String, var date : String, var seatNumber : Int)
class TicketNormal(val companyName : String, val name : String, var date : String, var seatNumber : Int)

fun main(){
    val ticketA = Ticket("koreanAir","ep","2021-06-05",30)
    val ticketB = TicketNormal("koreanAir","ep","2021-06-05",30)
    println(ticketA)
    println(ticketB)
}