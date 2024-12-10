package com.weather.api.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherApiService {

    @Value("${weather.api.key}")
    private String apiKey; // Add your API key here

    private static final String WEATHER_API_URL = "http://api.openweathermap.org/data/2.5/weather?lat={lat}&lon={lon}&appid={apiKey}&units=metric";

    public String getWeatherData(double lat, double lon) {
        String url = WEATHER_API_URL;
        
        RestTemplate restTemplate = new RestTemplate();
        
        // Make the API call
        String result = restTemplate.getForObject(url, String.class, lat, lon, apiKey);
        
        return result;
    }
}
