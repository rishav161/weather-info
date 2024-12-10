package com.weather.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.weather.api.entity.Pincode;

public interface PincodeRepository extends JpaRepository<Pincode, Long> {
    // This method is to find a Pincode by its 'pincode' value
    Optional<Pincode> findByPincode(String pincode);
}
