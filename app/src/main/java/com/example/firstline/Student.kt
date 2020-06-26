package com.example.firstline

//主构造函数的特点是没有方法体，直接定义在类名的后面
/*
class Student(val sno: String, val grade: Int, name: String, age: Int) : Person(name, age) {
    //Kotlin给我们提供了init结构体，主构造函数中如果需要写其他逻辑，可以使用它
    init {
        println(sno)
        println(grade)
    }
    //constructor关键字是定义此构造函数的
    constructor(name: String,age: Int):this("",0,name,age){}
    constructor():this("a",20){}
}*/

class Student(name: String, age: Int) : Person(name, age), Study {
    override fun readBooks() {
        println(name + " is reading")
    }

    //doHomeWork 在Study接口里有默认实现，所以这里可以不重写
    /*override fun doHomeWork() {
        println(name + " is doing homework")
    }*/



}
