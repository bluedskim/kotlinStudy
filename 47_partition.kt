fun main() {
    val numbers = listOf(1,-2,3,-4,5,-6)

    val evenOdd = numbers.partition { it % 2 == 0 }
    val (positives, negatives) = numbers.partition{it > 0}

    println("Numbers: $numbers")
    println("Even numbers: ${evenOdd.first}")   // -2,-4,-6
    println("Odd numbers: ${evenOdd.second}")   // 1,3,4
    println("Positive numbers: $positives")     // 1,3,5
    println("Negative numbers: $negatives")     // -2,-4,-6
}
