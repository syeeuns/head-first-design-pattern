package pizzastore

import pizza.CheesePizza
import pizza.ClamPizza
import pizza.PepperoniPizza
import pizza.Pizza
import pizza.PizzaType
import pizza.VeggiePizza
import pizzaingredient.NYPizzaIngredientFactory

class NYPizzaStore: PizzaStore() {
    override fun createPizza(type: PizzaType): Pizza {
        val pizzaIngredientFactory = NYPizzaIngredientFactory()
        return when (type) {
            PizzaType.CHEESE -> {
                val pizza = CheesePizza(pizzaIngredientFactory)
                pizza.name = "뉴욕 스타일 치즈 피자"
                pizza
            }
            PizzaType.PEPPERONI -> {
                val pizza = PepperoniPizza(pizzaIngredientFactory)
                pizza.name = "뉴욕 스타일 페퍼로니 피자"
                pizza
            }
            PizzaType.CLAM -> {
                val pizza = ClamPizza(pizzaIngredientFactory)
                pizza.name = "뉴욕 스타일 조개 피자"
                pizza
            }
            PizzaType.VEGGIE -> {
                val pizza = VeggiePizza(pizzaIngredientFactory)
                pizza.name = "뉴욕 스타일 야채 피자"
                pizza
            }
        }
    }
}
