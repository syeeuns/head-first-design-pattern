package duck

import behavior.FlyNoWay
import behavior.FlyWithWings
import behavior.MuteQuack
import behavior.Quack

class DecoyDuck : Duck(FlyNoWay.getInstance(), MuteQuack.getInstance()) {
    override fun display() {
        println("가짜 오리 모양")
    }
}
