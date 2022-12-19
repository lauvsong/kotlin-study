package typetest

fun main() {
    val number1: Int? = 3
    val number2: Long = number1?.toLong() ?: 0L

    printAgeIfPerson(Person("name", 20))

    val name = "김혜송"
    println("이름: ${name}")

    var str = """
        ABC
        DEF
        ${name}
    """.trimIndent()
    println(str)

    val str2 = "ABC"
    println(str2[0])
    println(str2[1])
    println(str2[2])
}

fun printAgeIfPerson(obj: Any) {
    if (obj is Person) {
        println(obj.age)
    }
}

fun printAgeIfPerson2(obj: Any?) {
    val person = obj as? Person
    println(person?.age)
}