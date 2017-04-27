package com.zmc.bean;

/**
 * Created by zhongmc on 2017/4/27.
 */
public class Location {
    private String place;
    private String year;

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Location() {
    }

    public Location(String place, String year) {
        this.place = place;
        this.year = year;
    }
}
