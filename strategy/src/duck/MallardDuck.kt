package duck

import behavior.FlyWithWings
import behavior.Quack

class MallardDuck : Duck(FlyWithWings.getInstance(), Quack.getInstance()) {
    override fun display() {
        println("물오리 모양")
    }
}
