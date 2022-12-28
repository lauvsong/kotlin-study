package etctest

fun main() {

    // 라벨 점프 미사용 권고. (복잡성 대폭 증가)
    abc@ for (i in 1..100) {
        for (j in 1..100) {
            if (j == 2) {
                break@abc
            }
            println("$i, $j")
        }
    }
}
