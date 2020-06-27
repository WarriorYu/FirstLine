package com.example.firstline.kotlin05

/**
 * 扩展函数表示即使在不修改某个类的源码的情况下，仍然可以向这个类添加新的函数
 * 使用扩展函数 判断一个字符串中有多少个字母
 */
fun String.lettersCount(): Int {
    var count = 0
    for (char in this) {// 这里直接用this 代替当前的字符串
        if (char.isLetter()) {
            count++;
        }
    }
    return count
}