package pizza

import pizzaingredient.PizzaIngredientFactory

class CheesePizza(
    private val pizzaIngredientFactory: PizzaIngredientFactory,
) : Pizza() {
    override fun prepare() {
        println("$name 준비중")
        dough = pizzaIngredientFactory.createDough()
        sauce = pizzaIngredientFactory.createSauce()
        cheese = pizzaIngredientFactory.createCheese()
    }
}
