package com.angela.destination;

import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@RestController
@RequestMapping("/cities")
public class CityController {

    @GetMapping
    public List<CityEntity> getCityInfo(){
        List<CityEntity> cityEntities = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        calendar.set(2019,Calendar.MARCH,20);
        cityEntities.add(new CityEntity("Barcelona","Spain",calendar.getTime(),0.8,true,30.5,0.0));
        return cityEntities;
    }

    @GetMapping("/{city}")
    public CityEntity getCity(@PathVariable String city){
        if(city.equals("Barcelona")){
            return this.getBarcelona();
        }else if(city.equals("Zurich")){
            return this.getZurich();
        }else{
            throw new ResourceNotFoundException();
        }
    }

    public CityEntity getBarcelona(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(2019,Calendar.MARCH,20);
        CityEntity cityEntity = new CityEntity("Barcelona","Spain",calendar.getTime(),0.8,true,30.5,0.0);
        return cityEntity;
    }

    public CityEntity getZurich(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(2019,Calendar.MARCH,20);
        CityEntity cityEntity = new CityEntity("Zurich","Switzerland",calendar.getTime(),0.8,true,30.5,0.0);
        return cityEntity;
    }
}
