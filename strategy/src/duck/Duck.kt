package duck

import behavior.FlyBehavior
import behavior.QuackBehavior

abstract class Duck(
    private var flyBehavior: FlyBehavior,
    private var quackBehavior: QuackBehavior
) {

    abstract fun display()

    fun performQuack() {
        quackBehavior.quack()
    }
    fun performFly() {
        flyBehavior.fly()
    }

    fun setFlyBehavior(fb: FlyBehavior) {
        flyBehavior = fb
    }

    fun setQuackBehavior(qb: QuackBehavior) {
        quackBehavior = qb
    }

    fun swim() {
        println("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠.")
    }
}
