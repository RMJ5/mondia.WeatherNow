package com.mondia.WeatherNow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mondia.WeatherNow.model.City;

public interface CityRepository extends JpaRepository<City, Long>{

}
