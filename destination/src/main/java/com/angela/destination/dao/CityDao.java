package com.angela.destination.dao;

import com.angela.destination.entity.CityEntity;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CityDao {
    @Select("select * from sun.city_weather")
    public List<CityEntity> getAll();
}
