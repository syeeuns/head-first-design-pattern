import beverage.Beverage
import beverage.DarkRoast
import beverage.Decaf
import beverage.Espresso
import beverage.HouseBlend
import decorator.Mocha
import decorator.SoyMilk
import decorator.Whip

fun main() {
    var beverage: Beverage = DarkRoast()
    beverage = Mocha(beverage)
    beverage = Mocha(beverage)
    beverage = Whip(beverage)
    println("${beverage.description} \$${beverage.cost()}")

    val beverage2 = HouseBlend()
    println("${beverage2.description} \$${beverage2.cost()}")

    var beverage3: Beverage = Espresso()
    beverage3 = SoyMilk(beverage3)
    beverage3 = Mocha(beverage3)
    beverage3 = Whip(beverage3)
    println("${beverage3.description} \$${beverage3.cost()}")
}
