package beverage

interface Beverage {
    val description: String
        get() = "제목 없음"
    val size: Size
        get() = Size.TALL
    fun cost(): Double
}

enum class Size {
    TALL, GRANDE, VENTI;
}
