package behavior

class Quack : QuackBehavior {
    override fun quack() {
        println("꽥!")
    }

    companion object {
        private val instance = Quack()
        fun getInstance() = instance
    }
}
