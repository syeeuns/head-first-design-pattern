package pizzaingredient

import pizzaingredient.cheese.Cheese
import pizzaingredient.cheese.ReggianoCheese
import pizzaingredient.clams.Clams
import pizzaingredient.clams.FreshClams
import pizzaingredient.dough.Dough
import pizzaingredient.dough.ThinCrustDough
import pizzaingredient.pepperoni.Pepperoni
import pizzaingredient.pepperoni.SlicedPepperoni
import pizzaingredient.sauce.MarinaraSauce
import pizzaingredient.sauce.Sauce
import pizzaingredient.veggies.Garlic
import pizzaingredient.veggies.Mushroom
import pizzaingredient.veggies.Onion
import pizzaingredient.veggies.RedPepper
import pizzaingredient.veggies.Veggies

class NYPizzaIngredientFactory: PizzaIngredientFactory {
    override fun createDough(): Dough {
        return ThinCrustDough()
    }

    override fun createSauce(): Sauce {
        return MarinaraSauce()
    }

    override fun createCheese(): Cheese {
        return ReggianoCheese()
    }

    override fun createVeggies(): List<Veggies> {
        return listOf(Garlic(), Onion(), Mushroom(), RedPepper())
    }

    override fun createPepperoni(): Pepperoni {
        return SlicedPepperoni()
    }

    override fun createClam(): Clams {
        return FreshClams()
    }
}
