package com.angela.destination.entity;

import java.util.Date;

public class CityEntity {
    private String city;
    private String country;
    private Date date;
    private Double cloudsCover;
    //badWeather: rainy, misty or snowy
    private Boolean badWeather;
    private Double temperature;
    private Double snowDepth;

    //无参构造函数
    public CityEntity() {
    }

    public CityEntity(String city, String country, Date date, Double cloudsCover, Boolean badWeather, Double temperature, Double snowDepth) {
        this.city = city;
        this.country = country;
        this.date = date;
        this.cloudsCover = cloudsCover;
        this.badWeather = badWeather;
        this.temperature = temperature;
        this.snowDepth = snowDepth;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getCloudsCover() {
        return cloudsCover;
    }

    public void setCloudsCover(Double cloudsCover) {
        this.cloudsCover = cloudsCover;
    }

    public Boolean getBadWeather() {
        return badWeather;
    }

    public void setBadWeather(Boolean badWeather) {
        this.badWeather = badWeather;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getSnowDepth() {
        return snowDepth;
    }

    public void setSnowDepth(Double snowDepth) {
        this.snowDepth = snowDepth;
    }
}
