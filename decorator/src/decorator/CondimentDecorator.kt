package decorator

import beverage.Beverage

interface CondimentDecorator : Beverage {
    val beverage: Beverage
}
