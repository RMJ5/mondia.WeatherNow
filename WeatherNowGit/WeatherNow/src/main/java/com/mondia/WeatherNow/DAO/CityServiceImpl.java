package com.mondia.WeatherNow.DAO;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mondia.WeatherNow.exception.CityNotFoundException;
import com.mondia.WeatherNow.model.City;
import com.mondia.WeatherNow.repository.CityRepository;

@Service
public class CityServiceImpl implements CityService {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(CityServiceImpl.class);
    
    @Resource
    private CityRepository CityRepository;

    @Transactional
    @Override
    public City create(City created) {
        LOGGER.debug("Creating a new City with information: " + created);
                
        return CityRepository.save(created);
    }

    @Transactional(rollbackFor = CityNotFoundException.class)
    @Override
    public City delete(Long CityId) throws CityNotFoundException {
        LOGGER.debug("Deleting City with id: " + CityId);
        
        City deleted = CityRepository.findOne(CityId);
        
        if (deleted == null) {
            LOGGER.debug("No City found with id: " + CityId);
            throw new CityNotFoundException();
        }
        
        CityRepository.delete(deleted);
        return deleted;
    }

    @Transactional(readOnly = true)
    @Override
    public List<City> findAll() {
        LOGGER.debug("Finding all Citys");
        return CityRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public City findById(Long id) {
        LOGGER.debug("Finding City by id: " + id);
        return CityRepository.findOne(id);
    }

    @Transactional(rollbackFor = CityNotFoundException.class)
    @Override
    public City update(City updated) throws CityNotFoundException {
        LOGGER.debug("Updating City with information: " + updated);
        
        City City = CityRepository.findOne(updated.getId());
        
        if (City == null) {
            LOGGER.debug("No City found with id: " + updated.getId());
            throw new CityNotFoundException();
        }
        
        City.update(updated.getSunset(), updated.getSunrise());

        return City;
    }

    /**
     * This setter method should be used only by unit tests.
     * @param CityRepository
     */
    protected void setCityRepository(CityRepository CityRepository) {
        this.CityRepository = CityRepository;
    }
}
