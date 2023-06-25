package behavior

class MuteQuack : QuackBehavior {
    override fun quack() {
        println("(조용~)")
    }

    companion object {
        private val instance = MuteQuack()
        fun getInstance() = instance
    }
}
