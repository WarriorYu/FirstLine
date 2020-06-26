package com.example.firstline

import android.util.Log
import java.util.*
import kotlin.concurrent.thread
import kotlin.math.max

fun main() {
    /*val a = 10
    println("a = " + a)*/

    /*var a: Int = 10
    a = a * 10;
    println("a = " + a)*/

    val a = 10
    val b = 20
    val value = largeNumber5(a, b)
    println("large number is " + value)

    val score = getScore2("Tom")
    println("Lily = " + score)
    //checkNumber(10L)
    //testFor2()
    //testStep()
    //testDownTo()


//    var p = Person("Jack",19)
//    p.eat()

//    var s = Student("abcd",20,"Tom",100)
//    var s = Student("yyy",20)
    /*  var s= Student()
      s.eat()*/

    //interface
    /*var s= Student("Tom",18)
    doStudy(s)*/

    //data 数据类
    val cellphone1 = Cellphone("Samsung", 1111.22)
    val cellphone2 = Cellphone("Samsung", 1111.22)
    println(cellphone1)
    println("cellphone1 equals cellphone2 " + (cellphone1 == cellphone2))

    //object 单例
    Singleton.singletonTest()

    //集合的创建和遍历
    //listOf  创建不可变集合
    val list = listOf("Apple", 1, "Banana", "Orange")
    for (fruit in list) {
        print(fruit)
    }
    println()

    //mutableListOf 创建可变集合
    val list2 = mutableListOf<String>("Apple", "Banana", "Orange")
    list2.add("Watermelon")
    for (fruit in list2) {
        print(fruit)
    }
    println()

    //Set 集合底层是使用hash映射机制来存放数据的，因此集合中的元素无法保证有序，这是和List集合的最大不同之处
    val set = setOf("Apple", "Banana", "Orange")
    for (fruit in set) {
        print(fruit)
    }
    println()

    //map
    val map = mapOf("Apple" to 1, "Banana" to 2, "Orange" to 3)
    for ((fruit, number) in map) {
        println(fruit + " --- " + number)
    }

    //Lambda
    //maxBy
    /*val list3 = listOf("Apple", "Banana", "Orange")
    val maxLengthFruit = list3.maxBy { it.length }
    println(maxLengthFruit)*/

    //map
    /*val list4 = listOf("Apple", "Banana", "Orange")
    val newList = list4.map { it.toUpperCase() }
    for (fruit in newList) {
        print(fruit)
    }
    println()*/

    //filter 过滤函数
    /*val list5 = listOf("Apple", "Banana", "Orange")
    val newList = list5.filter { it.length>5 }.map { it.toUpperCase() }
    for (fruit in newList) {
        println(fruit)
    }*/

    //any/all
    /* val list6 = listOf("Apple", "Banana", "Orange")
     val anyResult = list6.any { it.length > 5 }
     val allResult = list6.all { it.length > 5 }
     println("anyResult == "+anyResult+" , allResult == "+allResult)*/

    //Kotlin调用Java方法，Java函数式API
    /* Thread(object : Runnable {
         override fun run() {
             println("Thread is running")
         }
     }).start()

     Thread(Runnable {
         println("Thread2 is running")
     }).start()

     Thread {
         println("Thread3 is running")
     }.start()*/

    //空指针检查
    // "?" String? 表示可为空的字符串  String表示不可为空的字符串
    val s1: String = "a"
    val s2: String? = "bc"

    // “?.”当对象不为空时调用相应的方法，为空时什么都不做
    val s2Length = s2?.length
    println("s2Length = " + s2Length)

    // “?:” 这个操作符的左右两边都接收一个表达式，如果左边表达式的结果不为空就返回左边表达式的结果，
    //        否则返回右边表达式的结果

    val s3: String? = null
    val s3Length = s3?.length ?: 0
    println("s3Length = " + s3Length)

    // "!!" 非空断言工具
    //s3!!.length

    //let 函数
//    var study = Student("Lily",30)
    doStudy(null)

    //字符串内嵌表达式
    val p = 5
    val p2 = 10
    val str: String = "我有 $p 个苹果，还有${p * p2}个西瓜"
    println(str)

    //函数的默认参数值
    printParams(100)
    printParams(100,"haha")
    //让str使用默认值
    printParams(num = 20)
    //让num使用默认值
    printParams2(str = "world")

    //在柱构造函数中给字段设置默认值
    val testValue = TestDefaultValue("Lily", 28)
    println("${testValue.name}  ${testValue.info}")

}


fun largeNumber(a: Int, b: Int): Int {
    return max(a, b)
}

//以上代码可以简写为
fun largeNumber2(a: Int, b: Int): Int = max(a, b)

//由于Kotlin的类型推导机制，在函数内只有一行代码的情况下，以上代码可以省去返回值的类型，简写为
fun largeNumber3(a: Int, b: Int) = max(a, b)

//if
fun largeNumber4(a: Int, b: Int): Int {
    return if (a > b) {
        a
    } else {
        b
    }
}

//if 简写
fun largeNumber5(a: Int, b: Int) = if (a > b) {
    a
} else {
    b
}

//when
fun getScore(name: String) = when (name) {
    "Tom" -> 80
    "Jack" -> 90
    "Lily" -> 100
    else -> 0
}

//when 可以不传入参数，但是要使用 “==” 判断，Kotlin中“==”可以像Java的equals方法，直接判断字符串或者对象相等
fun getScore2(name: String) = when {
    name.startsWith("Tom") -> 110
    name == "Tom" -> 80
    name == "Jack" -> 90
    name == "Lily" -> 100
    else -> 0
}

//Kotlin中Int/Double/Float/Long 等与数字相关的类都是Number的子类
// is 关键字是类型匹配，相当于Java的instanceof 关键字
fun checkNumber(num: Number) {
    when (num) {
        is Int -> println("number is Int")
        is Long -> println("number is  Long")
        is Double -> println("number is Double")
        else -> println("number not support ")
    }
}

//for循环
// ".."是创建两端闭区间的关键字
fun testFor1() {
    for (i in 0..10) {
        println(i)
    }
}

// "untils"是创建两端左闭右开区间的关键字
fun testFor2() {
    for (i in 0 until 10) {
        println(i)
    }
}

// "step"是跳过一些元素的关键字
fun testStep() {
    for (i in 0 until 10 step 2) {
        println(i)
    }
}

// "downTo"是创建降序区间的关键字
fun testDownTo() {
    for (i in 10 downTo 0 step 2) {
        println(i)
    }
}

//多态
/*fun doStudy(study: Study) {
    study.readBooks()
    study.doHomeWork()
}*/

// 使用“?.” 每行代码都相当于使用了if，不高效
/*fun doStudy(study:Study?){
    study?.readBooks()
    study?.doHomeWork()
}*/

//使用let函数，只判断一次。let 函数可以处理全局变量的判空问题
fun doStudy(study: Study?) {
    study?.let {
        it.readBooks()
        it.doHomeWork()
    }
}

fun printParams(num:Int,str :String = "Hello"){
    println("num is $num,str is $str")
}

fun printParams2(num:Int = 30,str :String){
    println("num is $num,str is $str")
}