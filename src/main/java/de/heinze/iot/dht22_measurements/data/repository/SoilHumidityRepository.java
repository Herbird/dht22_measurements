package de.heinze.iot.dht22_measurements.data.repository;

import de.heinze.iot.dht22_measurements.data.dao.LightingDao;
import de.heinze.iot.dht22_measurements.data.dao.SoilHumidityDao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Author: christianheinz
 * Date: 07.04.20
 */

@Repository
public interface SoilHumidityRepository extends CrudRepository<SoilHumidityDao, Long> {

    Iterable<SoilHumidityDao> findByPlantId(Long plantId);
}
