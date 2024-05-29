package org.kotlinlang.play

fun main() {
    var a: String = "initial"  // 1
    println(a)
    val b: Int = 1             // 2
    val c = 3                  // 3
    var e: Int  // 1
    //println(e)  // Variable 'e' must be initialized.

    val d: Int  // 1

    if (someCondition()) {
        d = 1   // 2
    } else {
        d = 2   // 2
    }

    println(d) // 3
}

fun someCondition() = true
