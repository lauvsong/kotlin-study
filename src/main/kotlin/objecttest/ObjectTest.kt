package objecttest

fun main() {
    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)

    moveSomething(object : Movable {
        override fun move() {
            println("이동합니다.")
        }

        override fun fly() {
            println("날아갑니다.")
        }
    })
}

class Person private constructor(
    var name: String,
    var age: Int
) {
    companion object Factory : Log {
        private const val MIN_AGE = 1

        @JvmStatic  // Java에서 Kotlin companion object 사용 시 필요
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("Person 클래스의 동행객체")
        }
    }
}

object Singleton {
    var a: Int = 0
}

private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}