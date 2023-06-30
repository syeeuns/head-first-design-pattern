package subject

import observer.Observer

class WeatherData(
    private val observers: MutableSet<Observer> = mutableSetOf(),
    private var temperature: Float = 0F,
    private var humidity: Float = 0F,
    private var pressure: Float = 0F,
) {
    fun registerObserver(observer: Observer) {
        observers.add(observer)
    }

    fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    private fun notifyObservers() {
        observers.forEach { observer -> observer.update(temperature, humidity, pressure) }
    }

    private fun measurementChanged() {
        notifyObservers()
    }

    fun setMeasurements(temp: Float, humidity: Float, pressure: Float) {
        this.temperature = temp
        this.humidity = humidity
        this.pressure = pressure
        measurementChanged()
    }
}
