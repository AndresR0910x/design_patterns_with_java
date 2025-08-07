package com.desing_pattern.weather_api.config;

import com.weatherstation.api.Subject;
import com.weatherstation.displays.CurrentConditionsDisplay;
import com.weatherstation.displays.HeatIndexDisplay;
import com.weatherstation.displays.StatisticsDisplay;
import com.weatherstation.model.WeatherData;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Subject weatherData() {
        return new WeatherData();
    }

    @Bean
    public CurrentConditionsDisplay currentConditionsDisplay(Subject weatherData) {
        return new CurrentConditionsDisplay(weatherData);
    }

    @Bean
    public HeatIndexDisplay heatIndexDisplay(Subject weatherData) {
        return new HeatIndexDisplay(weatherData);
    }

    @Bean
    public StatisticsDisplay statisticsDisplay(Subject weatherData) {
        return new StatisticsDisplay(weatherData);
    }
}