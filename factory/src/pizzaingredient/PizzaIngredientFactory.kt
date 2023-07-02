package pizzaingredient

import pizzaingredient.cheese.Cheese
import pizzaingredient.clams.Clams
import pizzaingredient.dough.Dough
import pizzaingredient.pepperoni.Pepperoni
import pizzaingredient.sauce.Sauce
import pizzaingredient.veggies.Veggies

interface PizzaIngredientFactory {
    fun createDough(): Dough
    fun createSauce(): Sauce
    fun createCheese(): Cheese
    fun createVeggies(): List<Veggies>
    fun createPepperoni(): Pepperoni
    fun createClam(): Clams
}
