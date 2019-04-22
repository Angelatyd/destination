package com.angela.destination.service;

import com.angela.destination.entity.CityEntity;
import com.angela.destination.dao.CityDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
    @Autowired
    CityDao cityDao;

    public List<CityEntity> getAllCity(){
        return cityDao.getAll();
    }
}
