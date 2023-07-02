package pizzaingredient

import pizzaingredient.cheese.Cheese
import pizzaingredient.cheese.MozzarellaCheese
import pizzaingredient.clams.Clams
import pizzaingredient.clams.FrozenClams
import pizzaingredient.dough.Dough
import pizzaingredient.dough.ThickCrustDough
import pizzaingredient.dough.ThinCrustDough
import pizzaingredient.pepperoni.Pepperoni
import pizzaingredient.pepperoni.SlicedPepperoni
import pizzaingredient.sauce.PlumTomatoSauce
import pizzaingredient.sauce.Sauce
import pizzaingredient.veggies.BlackOlives
import pizzaingredient.veggies.Eggplant
import pizzaingredient.veggies.Spinach
import pizzaingredient.veggies.Veggies

class ChicagoPizzaIngredientFactory : PizzaIngredientFactory {
    override fun createDough(): Dough {
        return ThickCrustDough()
    }

    override fun createSauce(): Sauce {
        return PlumTomatoSauce()
    }

    override fun createCheese(): Cheese {
        return MozzarellaCheese()
    }

    override fun createVeggies(): List<Veggies> {
        return listOf(BlackOlives(), Spinach(), Eggplant())
    }

    override fun createPepperoni(): Pepperoni {
        return SlicedPepperoni()
    }

    override fun createClam(): Clams {
        return FrozenClams()
    }
}
