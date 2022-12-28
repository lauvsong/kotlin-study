package etctest

val number = 1

fun getNumberOrNull(): Int? {
    return if (number <= 0) {
        null
    } else {
        number
    }
}

fun getNumberOrNullv2(): Int? {
    return number.takeIf { it > 0 }
}

fun getNumberOrNullv3(): Int? {
    return number.takeUnless { it <= 0 }
}