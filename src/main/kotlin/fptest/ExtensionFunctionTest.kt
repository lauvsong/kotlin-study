package fptest

fun main() {
    val str = "ABC"
    println(str.lastChar())
}

fun String.lastChar(): Char{
    return this[this.length - 1]
}

val String.lastChar: Char
    get() = this[this.length - 1]