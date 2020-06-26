package com.example.firstline

//open 关键字表示该类可以被继承   Kotlin中普通的类是不允许被继承的
open class Person(name: String, age: Int) {
    var name = name
    var age = age
    fun eat() {
        println(name + " is eating. He is  " + age + " year old")
    }
}