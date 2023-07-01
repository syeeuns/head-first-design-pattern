package decorator

import beverage.Beverage

class Milk(
    override val beverage: Beverage,
    override val description: String = beverage.description + ", 우유"
) : CondimentDecorator {
    override fun cost(): Double {
        return beverage.cost() + 0.10
    }
}
