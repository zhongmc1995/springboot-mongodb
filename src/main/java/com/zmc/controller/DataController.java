package com.zmc.controller;

import com.zmc.bean.Location;
import com.zmc.bean.Person;
import com.zmc.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * Created by zhongmc on 2017/4/27.
 */

@RestController
public class DataController {
    @Autowired
    PersonRepository personRepository;
    @RequestMapping(value = "/save",method = RequestMethod.GET)
    public Person save(){
        Person p = new Person("zmc",23);
        Collection<Location> locs = new LinkedHashSet<>();
        Location shanghai = new Location("shanghai", "2014-9-9");
        locs.add(shanghai);

        Location beijing = new Location("beijing", "2015-9-9");
        locs.add(beijing);

        Location nanchang = new Location("nanchang", "2016-9-9");
        locs.add(nanchang);

        Location ganzhou = new Location("ganzhou", "2017-9-9");
        locs.add(ganzhou);

        p.setLocations(locs);

        return personRepository.save(p);
    }

    @RequestMapping("q1")
    public Person q1(String name){
        return personRepository.findByName(name);
    }
    @RequestMapping("q2")
    public List<Person> q2(Integer age){
        return personRepository.withQueryFindByAge(age);
    }
}
