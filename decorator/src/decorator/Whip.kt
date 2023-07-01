package decorator

import beverage.Beverage

class Whip(
    override val beverage: Beverage,
    override val description: String = beverage.description + ", 휘핑"
) : CondimentDecorator {
    override fun cost(): Double {
        return beverage.cost() + 0.10
    }
}
