package com.example.firstline.kotlin04

import java.lang.IllegalArgumentException

fun main() {

}

/**
 * 普通写法，编译器会提示我们必须加入 else 的条件分支
 */
fun getResultMsg(result: Result) = when(result){
    is Success -> result.msg
    is Failure ->result.error
    else -> throw IllegalArgumentException()
}

/**
 * 使用关键字 sealed class 将Result接口改成密封类，就可以不加else了
 */
fun getResultMsg2(result: Result2) = when(result){
    is Success2 -> result.msg
    is Failure2 ->result.error

//    else -> throw IllegalArgumentException()
}