package com.zmc.repositories;

import com.zmc.bean.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * Created by zhongmc on 2017/4/27.
 */
public interface PersonRepository extends MongoRepository<Person,String> {

    /**
     * 通过用户名查询
     * @param name
     * @return
     */
    Person findByName(String name);

    /**
     * 通过age查询
     * @param age
     * @return
     */
    @Query("{'age':?0}")
    List<Person> withQueryFindByAge(Integer age);
}
