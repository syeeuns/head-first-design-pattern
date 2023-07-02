package pizza

import pizzaingredient.PizzaIngredientFactory

class ClamPizza(
    private val pizzaIngredientFactory: PizzaIngredientFactory,
) : Pizza() {
    override fun prepare() {
        println("$name 준비중")
        dough = pizzaIngredientFactory.createDough()
        sauce = pizzaIngredientFactory.createSauce()
        cheese = pizzaIngredientFactory.createCheese()
        clam = pizzaIngredientFactory.createClam()
    }
}
