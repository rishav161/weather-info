package com.weather.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.weather.api.service.WeatherImpl;

@RestController
public class WeatherController {

    @Autowired
    private WeatherImpl weatherService;

    @GetMapping("/api/weather/getWeatherFromPincode")
    public String getWeatherByPincode(@RequestParam String pincode) {
        return weatherService.getWeatherFromPincode(pincode);
    }
}
