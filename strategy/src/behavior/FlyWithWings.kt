package behavior

class FlyWithWings : FlyBehavior {
    override fun fly() {
        println("날고 있어요!")
    }

    companion object {
        private val instance = FlyWithWings()
        fun getInstance() = instance
    }
}
