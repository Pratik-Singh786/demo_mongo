package com.example.mongo.demomongo.controller;

import com.example.mongo.demomongo.models.User;
import com.example.mongo.demomongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController
{
    @Autowired
    UserRepository repository;

    @GetMapping("/getUser")
    public List<User> getUser()
    {
     return repository.findAll();

    }
    @GetMapping("/getUserByName")
    public List<User> getUserByName(@RequestParam("name") String name )
    {
     return repository.findByName(name);
    }
    @GetMapping("/users/age")
    public List<User> findUserByAge(@PathVariable("age")int age)
    {
        return repository.findUserByAge(age);
    }
    @GetMapping("/users/name")
    public List<User> findUserByName(@PathVariable("name")String name)
    {
        return repository.findUserByName(name);
    }




    @PostMapping("/insertUser")
    public ResponseEntity insertUser(@RequestBody User user)
    {
        repository.save(user);
        return new ResponseEntity<>("user inserted", HttpStatus.ACCEPTED);
    }
   // mongo "mongodb+srv://cluster0.zayor.mongodb.net/User" --username pratik
   // mongo "mongodb+srv://cluster0.zayor.mongodb.net/MyDb" --username pratik


}
