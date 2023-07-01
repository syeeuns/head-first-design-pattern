package beverage

class Decaf : Beverage {
    override val description: String = "디카페인 커피"
    override fun cost(): Double = 1.05
}
