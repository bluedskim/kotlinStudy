package org.kotlinlang.play

fun main() {
    operator fun Int.times(str: String) = str.repeat(this)       // 1
    //The operator symbol for times() is * so that you can call the function using 2 * "Bye"
    println(2 * "Bye ")                                          // 2

    operator fun String.get(range: IntRange) = substring(range)  // 3
    val str = "Always forgive your enemies; nothing annoys them so much."
    println(str[0..14])                                          // 4
}
