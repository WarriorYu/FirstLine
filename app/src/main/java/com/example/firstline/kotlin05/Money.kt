package com.example.firstline.kotlin05

class Money(val value: Int) {

    operator fun plus(money: Money):Money {
        val sum = value + money.value
        return Money(sum)
    }
}