package com.example.firstline.kotlin03

import android.content.Intent
import com.example.firstline.MainActivity
import java.lang.StringBuilder

/**
 * with / run / apply 标准函数
 */
fun main() {
    //类似Java的写法
    /*val list = listOf("Apple", "Banana", "Pear", "Grape")
    val builder = StringBuilder()
    builder.append("Start eating fruites.\n")
    for (fruit in list) {
        builder.append(fruit).append("\n")
    }
    builder.append("Ate all fruits.")
    val result = builder.toString()
    println(result)*/

    /**
     *  with 函数，第一个参数是任意对象，第二个参数是Lambda表达式。with函数会在Lambda表达式中提供
     *  第一个参数的上下文，并使用Lambda表达式中的最后一行代码作为返回值返回
     */

    /*
    val list = listOf("Apple", "Banana", "Pear", "Grape")
    val result = with(StringBuilder()){
        append("Start eating fruites.\n")
        for (fruit in list) {
            append(fruit).append("\n")
        }
        append("Ate all fruits.")
        toString()
    }
    println(result)
    */

    /**
     *  run 函数，run函数一定要通过一个对象调用才行，其次run函数只接收一个Lambda参数。run和with函数一样，会在Lambda表达式中提供
     *  第一个参数的上下文，并使用Lambda表达式中的最后一行代码作为返回值返回。但是
     */

    /*
    val list = listOf("Apple", "Banana", "Pear", "Grape")
    val result= StringBuilder().run {
        append("Start eating fruites.\n")
        for (fruit in list) {
            append(fruit).append("\n")
        }
        append("Ate all fruits.")
        toString()
    }
    println(result)
    */

    /**
     * apply 函数，和run 函数极其相似，都是在某个对象上调用，并且只接收一个Lambda表达式。
     * 也会在Lambda表达式中提供调用对象的上下文，但是apply函数无法指定返回值，而是会自动返回
     * 调用对象本身
     */

   /*
   val list = listOf("Apple", "Banana", "Pear", "Grape")
    val result= StringBuilder().apply {
        append("Start eating fruites.\n")
        for (fruit in list) {
            append(fruit).append("\n")
        }
        append("Ate all fruits.")
    }
    println(result.toString())
    */

    //掉用单例的工具类
    Util.doAction()

    // 使用companion object 伴生类实现工具类里的方法直接掉用，相当于掉用了伴生类对象的方法
    //Util2.doAction2()

    //使用@JvmStatic 定义静态方法
    Util2.doAction3()

    //顶层方法:不用管包名路径，也不用创建实例，直接调用方法。
    doSomething()

}