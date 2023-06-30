package observer

class FooDisplay : DisplayElement, Observer {
    override fun display() {
        println("FooDisplay")
    }

    override fun update(temp: Float, humidity: Float, pressure: Float) {
        display()
    }
}
