package com.example.firstline.kotlin04

sealed class Result2
class Success2(val msg: String) : Result2() //因为密封类是可继承的类，这里必须加上一对括号
class Failure2(val error: Exception) : Result2()