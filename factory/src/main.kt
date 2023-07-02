import pizza.PizzaType
import pizzastore.ChicagoPizzaStore
import pizzastore.NYPizzaStore
import pizzastore.PizzaStore

fun main() {
    val nyPizzaStore: PizzaStore = NYPizzaStore()
    val chicagoPizzaStore = ChicagoPizzaStore()

    val nyCheesePizza = nyPizzaStore.orderPizza(PizzaType.CHEESE)
    println("Ethan ordered a ${nyCheesePizza.name}")
    println(nyCheesePizza.getFullName())

    println()
    val chicagoClamPizza = chicagoPizzaStore.orderPizza(PizzaType.CLAM)
    println("Joel ordered a ${chicagoClamPizza.name}")
    println(chicagoClamPizza.getFullName())

    println()
    val nyVeggiePizza = nyPizzaStore.orderPizza(PizzaType.VEGGIE)
    println("Yeny ordered a ${nyVeggiePizza.name}")
    println(nyVeggiePizza.getFullName())
}
