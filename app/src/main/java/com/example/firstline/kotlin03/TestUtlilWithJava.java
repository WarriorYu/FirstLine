package com.example.firstline.kotlin03;

/**
 * Java 中调用Kotlin的方法
 */
public class TestUtlilWithJava {
    public static void main(String[] args) {
        //Java 调用Kotlin的companion object 关键字 的伴生类的方法
//        Util2.Companion.doAction2();

        //Java 调用Kotlin的 @JvmStatic 静态方法
        Util2.doAction3();

        //Java 调用Kotlin的顶层方法，在类名后面添加“Kt”,然后调用
        Util3Kt.doSomething();
    }
}
