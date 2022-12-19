package visibilitytest

val NUM = 3

fun add(a: Int, b: Int): Int {
    return a + b
}

fun isDirectoryPath(path: String): Boolean {
    return path.endsWith("/")
}

open class Cat protected constructor()