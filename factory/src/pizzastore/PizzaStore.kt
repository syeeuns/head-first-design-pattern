package pizzastore

import pizza.Pizza
import pizza.PizzaType

abstract class PizzaStore {
    fun orderPizza(type: PizzaType): Pizza {
        val pizza: Pizza = createPizza(type)
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()
        return pizza
    }

    abstract fun createPizza(type: PizzaType): Pizza
}
