package com.weather.api.service;

import com.weather.api.entity.WeatherData;

public interface WeatherService {
    WeatherData getWeatherData(String pincode, String date);
}
