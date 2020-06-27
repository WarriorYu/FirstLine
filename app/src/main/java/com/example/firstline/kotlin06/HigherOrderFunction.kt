package com.example.firstline.kotlin06

fun main() {
    val num1 = 100
    val num2 = 80
    /*val result1 = num1AndNum2(num1, num2, ::plus)
    val result2 = num1AndNum2(num1, num2, ::minus)
    println("result1 is $result1")
    println("result2 is $result2")*/

    val result1 = num1AndNum2(num1, num2) { n1, n2 ->
        n1 + n2
    }

    val result2 = num1AndNum2(num1, num2) { n1, n2 ->
        n1 - n2
    }

    println("result1 is $result1")
    println("result2 is $result2")

    /**
     * inline 内联函数和非内联函数的一个重大区别：内联函数所引用的Lambda表达式中是可以使用return关键字来进行函数返回的，
     * 而非内敛函数只能进行局部返回,而且是用 return@methodName
     *
     *
     */
    println("main start")
    val str = ""
    printString(str) { s ->
        println("lambda start")
        if (s.isEmpty()) return
        println(s)
        println("lambda end")
    }
    println("main end")
}

/**
 * 如果一个函数接收另一个函数作为参数，或者返回值的类型是另一个函数，那么该函数就称为高阶函数
 * 这种高阶函数的写法原理是，在底层将Lambda表达式转换成了匿名内部类的方式。每调用一次Lambd表达式，
 * 都会创建一个新的匿名内部类，当然会造成额外的内存和性能开销
 */
/*fun num1AndNum2(num1: Int, num2: Int, operation: (Int, Int) -> Int): Int {
    val result = operation(num1, num2)
    return result
}*/

/**
 * 加上 inline 关键字 就是内联函数。
 * 内联函数的原理是，Kotlin编译器会将内联函数中的代码在编译的时候自动替换到掉用它的地方，这样就不存在运行时的开销了。
 */
inline fun num1AndNum2(num1: Int, num2: Int, operation: (Int, Int) -> Int): Int {
    val result = operation(num1, num2)
    return result
}

fun plus(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun minus(num1: Int, num2: Int): Int {
    return num1 - num2
}

/**
* inline 内联函数和非内联函数的一个重大区别：内联函数所引用的Lambda表达式中是可以使用return关键字来进行函数返回的，
* 而非内敛函数只能进行局部返回。
*/
inline fun printString(str: String, block: (String) -> Unit) {
    println("printString begin")
    block(str)
    println("printString end")
}

/**
 *  crossinline 关键字 用于保证inline 内联函数的Lambda表达式中一定不会使用return关键字，这样冲突就不存在了
 */
inline fun runRannable(crossinline block: () -> Unit) {
    val runnable = Runnable {
        block()
        return@Runnable //这里可以使用return@Runnable 进行局部返回
    }
}