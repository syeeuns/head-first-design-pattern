package duck

import behavior.FlyWithWings
import behavior.Quack

class RedheadDuck : Duck(FlyWithWings.getInstance(), Quack.getInstance()) {
    override fun display() {
        println("붉은머리 오리 모양")
    }
}
