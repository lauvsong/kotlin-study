package nulltest

fun main() {
    val str: String? = null
    println(str?.length ?: 0)
}

fun startsWithA1(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("str is null")
}

fun startsWithA2(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

fun startWith(str: String?): Boolean {
    return str!!.startsWith("A")
}