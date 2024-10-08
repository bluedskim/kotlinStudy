val numbers = listOf(1, -2, 3, -4, 5, -6)     // 1

val doubled = numbers.map { x -> x * 2 }      // 2

val tripled = numbers.map { it * 3 }          // 3

fun main() {
    println("doubled: ${doubled}")               // 6
    println("tripled: ${tripled}")               // 6
}
