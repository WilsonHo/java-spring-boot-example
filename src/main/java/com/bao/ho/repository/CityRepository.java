package com.bao.ho.repository;

import com.bao.ho.bean.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created on 6/20/18.
 */
@Repository
public interface CityRepository extends CrudRepository<City, Long> {
}
