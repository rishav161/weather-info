package com.weather.api.service;

import com.weather.api.entity.Pincode;
import com.weather.api.repository.PincodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WeatherImpl {

    @Autowired
    private PincodeRepository pincodeRepository;

    @Autowired
    private WeatherApiService weatherApiService;

    public String getWeatherFromPincode(String pincode) {
        // Find the pincode from the database
        Optional<Pincode> pincodeData = pincodeRepository.findByPincode(pincode);
        
        if (pincodeData.isPresent()) {
            Pincode p = pincodeData.get();
            // Get weather data from the external weather API using the latitude and longitude
            String weatherData = weatherApiService.getWeatherData(Double.parseDouble(p.getLatitude()), Double.parseDouble(p.getLongitude()));
            return weatherData;
        } else {
            return "No data found for Pincode: " + pincode;
        }
    }
}
