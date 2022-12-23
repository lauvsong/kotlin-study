package dtotest

fun handleCountry(country: Country) {
    when (country) {
        Country.KOREA -> TODO()
        Country.JAPAN -> TODO()
    }
}

enum class Country(
    private val code: String,
) {
    KOREA("KO"),
    JAPAN("JP");
}