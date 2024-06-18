class Configuration(var host: String, var port: Int)

fun main() {
    val configuration = Configuration(host = "1.1.1.1", port = 2222)

    with(configuration) {
        println("$host:$port")
    }

    println("${configuration.host}:${configuration.port}")
}
