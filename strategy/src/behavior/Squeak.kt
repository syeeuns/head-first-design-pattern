package behavior

class Squeak : QuackBehavior {
    override fun quack() {
        println("고무오리 꽥!")
    }

    companion object {
        private val instance = Squeak()
        fun getInstance() = instance
    }
}
