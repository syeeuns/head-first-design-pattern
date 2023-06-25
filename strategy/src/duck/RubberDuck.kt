package duck

import behavior.FlyNoWay
import behavior.FlyWithWings
import behavior.Quack
import behavior.Squeak

class RubberDuck : Duck(FlyNoWay.getInstance(), Squeak.getInstance()) {
    override fun display() {
        println("고무 오리 모양")
    }
}
