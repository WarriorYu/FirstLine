package com.example.firstline.kotlin02

//data 关键字代表数据类，Kotlin会根据主构造函数中的参数自动将equals()/hashCode()/toString()等固定
//且无实际逻辑意义的方法自动生成
data class Cellphone(val brand: String, val price: Double) {
}