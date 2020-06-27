package com.example.firstline.kotlin05

fun main() {
    val str = "ABC123xyz"
    val count = StringUtil.lettersCount(str)
    println(count)

    //扩展函数
    println(str.lettersCount())

    // operator 关键字  运算符重载。Kotlin 提供了允许我们重载的运算法和关键字多达十几个。
    val money1 = Money(5)
    val money2 = Money(10)
    val money3 = money1 + money2
    println(money3.value)

    // 使用 times 重载乘法 “*” ，让字符串重复 n 次
    val str1 = "ABC" * 3
    println(str1)

}

operator fun String.times(n: Int) = repeat(n)