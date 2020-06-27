package com.example.firstline.kotlin05

object StringUtil {
    fun lettersCount(str: String): Int {
        var count = 0
        for (char in str) {
            if (char.isLetter()) {
                count++;
            }
        }
        return count
    }
}