package behavior

class FlyNoWay : FlyBehavior {
    override fun fly() {
        println("저는 못 날아요.")
    }

    companion object {
        private val instance = FlyNoWay()
        fun getInstance() = instance
    }
}
