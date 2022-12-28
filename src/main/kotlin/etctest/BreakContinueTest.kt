package etctest

fun main() {
    val numbers = listOf(1,2,3,4,5)

    // break
    run {
        numbers.forEach { number ->
            if (number == 3) {
                return@run
            }
            println(number)
        }
    }

    // continue
    numbers.forEach { number ->
        if (number == 2) {
            return@forEach
        }
        println(number)
    }
}