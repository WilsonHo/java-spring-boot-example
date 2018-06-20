package com.bao.ho.service;

import com.bao.ho.bean.City;
import com.bao.ho.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created on 6/20/18.
 */
@Service
public class CityService implements ICityService {

    @Autowired
    private CityRepository cityRepository;

    @Override
    public List<City> findAll() {

        List<City> cities = (List<City>) cityRepository.findAll();

        return cities;
    }
}