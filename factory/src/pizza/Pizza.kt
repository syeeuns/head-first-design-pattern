package pizza

import pizzaingredient.cheese.Cheese
import pizzaingredient.clams.Clams
import pizzaingredient.dough.Dough
import pizzaingredient.pepperoni.Pepperoni
import pizzaingredient.sauce.Sauce
import pizzaingredient.veggies.Veggies

abstract class Pizza {
    lateinit var name: String
    lateinit var dough: Dough
    lateinit var sauce: Sauce
    lateinit var cheese: Cheese
    var veggies: List<Veggies>? = null
    var pepperoni: Pepperoni? = null
    var clam: Clams? = null

    abstract fun prepare()

    fun bake() {
        println("175도에서 25분간 굽습니다.")
    }

    fun cut() {
        println("피자를 8조각으로 자릅니다.")
    }

    fun box() {
        println("피자를 포장합니다.")
    }

    fun getFullName() {
        println("---- $name 메뉴에 들어간 재료들 ----")
        println(dough.name)
        println(sauce.name)
        println(cheese.name)
        veggies?.forEach{ println(it.name) }
        clam?.let { println(it.name) }
        pepperoni?.let { println(it.name) }
    }
}
