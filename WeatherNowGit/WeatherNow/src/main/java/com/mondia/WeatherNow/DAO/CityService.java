package com.mondia.WeatherNow.DAO;

import java.util.List;

import com.mondia.WeatherNow.exception.CityNotFoundException;
import com.mondia.WeatherNow.model.City;

public interface CityService {

    /**
     * Creates a new City.
     * @param created   The information of the created City.
     * @return  The created City.
     */
    public City create(City created);
 
    /**
     * Deletes a City.
     * @param CityId  The id of the deleted City.
     * @return  The deleted City.
     * @throws CityNotFoundException  if no City is found with the given id.
     */
    public City delete(Long CityId) throws CityNotFoundException;
 
    /**
     * Finds all Citys.
     * @return  A list of Citys.
     */
    public List<City> findAll();
 
    /**
     * Finds City by id.
     * @param id    The id of the wanted City.
     * @return  The found City. If no City is found, this method returns null.
     */
    public City findById(Long id);
 
    /**
     * Updates the information of a City.
     * @param updated   The information of the updated City.
     * @return  The updated City.
     * @throws CityNotFoundException  if no City is found with given id.
     */
    public City update(City updated) throws CityNotFoundException;
}

