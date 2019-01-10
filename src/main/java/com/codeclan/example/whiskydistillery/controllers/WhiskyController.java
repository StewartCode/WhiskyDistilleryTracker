package com.codeclan.example.whiskydistillery.controllers;

import com.codeclan.example.whiskydistillery.models.Distillery;
import com.codeclan.example.whiskydistillery.models.Whisky;
import com.codeclan.example.whiskydistillery.repositories.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/whiskies")
public class WhiskyController {

    @Autowired
    WhiskyRepository whiskyRepository;

    @GetMapping(value = "/getallwhiskiesforaparticularyear/{year}")
    public List<Whisky> findAllWhiskiesByYear(@PathVariable int year){
          return whiskyRepository.findAllWhiskiesByYear(year);
    }

    @GetMapping(value = "/getallwhiskiesforaparticularregion/{region}")
    public List<Whisky> findAllWhiskiesByRegion(@PathVariable String region){
        return whiskyRepository.findAllWhiskiesByRegion(region);
    }

    @GetMapping(value = "/getallwhiskiesforaparticulardistilleryandage/{distillery}/{age}")
    public List<Whisky> findAllWhiskiesByDistilleryAndAge(@PathVariable String distillery, int age){
        return whiskyRepository.findAllWhiskiesByDistilleryAndAge(distillery, age);
    }
}







   // get all the whisky from a particular distillery that's a specific age

   // Get distilleries that have whiskies that are 12 years old