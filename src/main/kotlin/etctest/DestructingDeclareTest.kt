package etctest

class Person(
    val name: String,
    val age: Int
) {
    operator fun component1(): String {
        return this.name
    }

    operator fun component2(): Int {
        return this.age
    }
}

fun main() {

    val person = Person("Alice", 29)
    val (name, age) = person    // 각각 componentN 함수 호출

//    val name = person.component1()
//    val age = person.component2()

    println("이름 : $name, 나이 : $age")
}