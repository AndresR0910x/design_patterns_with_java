package com.desing_pattern.weather_api.controller;
//Observer pattern added
import com.weatherstation.api.Subject;
import com.weatherstation.model.WeatherData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {
    private final Subject weatherData;

    @Autowired
    public WeatherController(Subject weatherData) {
        this.weatherData = weatherData;
    }

    @PostMapping("/weather")
    public void updateWeather(
            @RequestParam float temperature,
            @RequestParam float humidity,
            @RequestParam float pressure) {
        if (weatherData instanceof WeatherData) {
            ((WeatherData) weatherData).setMeasurements(temperature, humidity, pressure);
        }
    }
}