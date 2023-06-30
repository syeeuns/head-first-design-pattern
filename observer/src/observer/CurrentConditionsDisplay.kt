package observer

import subject.WeatherData

class CurrentConditionsDisplay(
    private val weatherData: WeatherData,
    private var temperature: Float = 0F,
    private var humidity: Float = 0F,
) : DisplayElement, Observer {
    init {
        weatherData.registerObserver(this)
    }

    override fun display() {
        println("현재 상태 : 온도 $temperature F, 습도 $humidity %")
    }

    override fun update(temp: Float, humidity: Float, pressure: Float) {
        this.temperature = temp
        this.humidity = humidity
        display()
    }
}
