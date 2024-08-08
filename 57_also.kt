/**
 * https://play.kotlinlang.org/byExample/06_scope_functions/04_apply
 * also works like apply: it executes a given block and returns the object called
 */
fun writeCreationLog(p: Person) {
    println("A new person ${p.name} was created")
}

fun main() {
    val jake = Person("Jake", 30, "Android developer")
        .also{
            writeCreationLog(it)
        }
}
