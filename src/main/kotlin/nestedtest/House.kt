package nestedtest

class House(
    var address: String,
    var livingRoom: LivingRoom = LivingRoom(10.0)
) {
    class LivingRoom (  // static class (바깥 클래스 참조 X)
        private var area: Double
    )

    inner class LivingRoom2(    // inner class (바깥 클래스 참조 O)
        private val area: Double
    ) {
        val address: String
            get() = this@House.address
    }
}