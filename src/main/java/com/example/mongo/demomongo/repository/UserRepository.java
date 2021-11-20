package com.example.mongo.demomongo.repository;

import com.example.mongo.demomongo.models.Address;
import com.example.mongo.demomongo.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface UserRepository extends MongoRepository<User,String>
{
    @Query("{'age' : {$gte: ?0 }}")
    public List<User> findUserByAge(int age);

    @Query("{'name' : ?0}")
    public List<User> findUserByName(String name);



    public List<User> findByName(String name);
    public List<User> findByAge(int age);
    public List<User> findByBmi(double bmi);
    public List<User> findByAddress(Address address);

}
