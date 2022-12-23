package dtotest

fun main() {
    val dto1 = PersonDto("홍길동", 20)
    println(dto1)
}

data class PersonDto(
    val name: String,
    val age: Int
)