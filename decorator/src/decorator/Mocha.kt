package decorator

import beverage.Beverage

class Mocha(
    override val beverage: Beverage,
    override val description: String = beverage.description + ", 모카"
) : CondimentDecorator {
    override fun cost(): Double {
        return beverage.cost() + 0.20
    }
}
