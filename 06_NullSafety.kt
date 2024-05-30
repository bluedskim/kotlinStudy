package org.kotlinlang.play

fun main() {
    var neverNull: String = "This can't be null"            // 1

    //Kotlin: Null can not be a value of a non-null type String
    //neverNull = null                                        // 2

    //Declares a nullable String variable.
    var nullable: String? = "You can keep a null here"      // 3

    nullable = null                                         // 4

    var inferredNonNull = "The compiler assumes non-null"   // 5

    //When trying to assign null to a variable with inferred type, a compilation error is produced.
    //inferredNonNull = null                                  // 6

    fun strLength(notNull: String): Int {                   // 7
        return notNull.length
    }

    strLength(neverNull)                                    // 8
    nullable = "asdf"
    //When calling the function with a String? (nullable) argument, a compilation error is produced.
    strLength(nullable)                                     // 9
}
