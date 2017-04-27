package com.zmc.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Collection;
import java.util.LinkedHashSet;

/**
 * Created by zhongmc on 2017/4/27.
 */

@Document
public class Person {
    @Id
    private String id;

    private String name;

    private Integer age;

    @Field("locas")
    private Collection<Location> locations = new LinkedHashSet<Location>();

    public Person() {
    }

    public Person(String id, String name, Integer age, Collection<Location> locations) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.locations = locations;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Collection<Location> getLocations() {
        return locations;
    }

    public void setLocations(Collection<Location> locations) {
        this.locations = locations;
    }
}
