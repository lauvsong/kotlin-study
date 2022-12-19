package operatortest

import com.lauvsong.JavaMoney

fun main() {

    val jMoney1 = JavaMoney(2_000L)
    val jMoney2 = JavaMoney(1_000L)
    val jMoney3 = JavaMoney(1_000L)

    if (jMoney1 > jMoney2) {
        println("money1이 money2보다 크다")
    }

    println(jMoney2 === jMoney3)
    println(jMoney2 == jMoney3)

    val money1 = Money(1_000L)
    val money2 = Money(2_000L)

    println(money1 + money2)
}