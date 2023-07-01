package decorator

import beverage.Beverage

class SoyMilk(
    override val beverage: Beverage,
    override val description: String = beverage.description + ", 두유"
) : CondimentDecorator {
    override fun cost(): Double {
        return beverage.cost() + 0.15
    }
}
