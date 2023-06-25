import behavior.Squeak
import duck.DecoyDuck
import duck.MallardDuck
import duck.RedheadDuck
import duck.RubberDuck

fun main() {
    val ducks = listOf(
        MallardDuck(),
        RedheadDuck(),
        RubberDuck(),
        DecoyDuck()
    )

    ducks.forEach { duck ->
        duck.display()
        duck.performFly()
        duck.performQuack()
        duck.swim()
        if (duck is DecoyDuck) {
            duck.setQuackBehavior(Squeak.getInstance())
            println("== 가짜 오리의 소리를 바꿉니다. ==")
            duck.performQuack()
        }
        println()
    }
}
