package com.example.firstline.kotlin03

/**
 *
 */
class Util2 {
    fun doAction1() {
        println("do action1")
    }

    //使用伴生类，让doAction2方法可以直接调用，Kotlin保证一个类中始终只有一个伴生类对象
//    companion object{
//        fun doAction2() {
//            println("do action2")
//        }
//    }

    //使用 @JvmStatic，Kotlin编译器会将方法编译成真正的静态方法
    companion object{
        @JvmStatic
        fun doAction3() {
            println("do action2")
        }
    }

}