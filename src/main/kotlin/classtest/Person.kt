package classtest

fun main() {
    val person = Person("홍길동")
    println(person.name)
    person.age = 10
    println(person.age)
}

class Person (
    name: String = "이름없음",
    var age: Int = 1
) {
    var name = name
        get() = field.uppercase()
        set(value) {
            field = value.uppercase()
        }

    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다")
        }
        println("초기화 블록")
    }

    val isAdult: Boolean
        get() = this.age >= 20

//    constructor(name: String): this(name, 1) {
//        println("보조 생성자 호출")
//    }
//
//    constructor(): this("홍길동") {
//        println("보조 생성자 호출")
//    }
}