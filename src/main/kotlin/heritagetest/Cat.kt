package heritagetest

class Cat(
    species: String
) : Animal(species, 4) {

    override fun move() {
        println("고양이가 네발로 걷습니다.")
    }
}