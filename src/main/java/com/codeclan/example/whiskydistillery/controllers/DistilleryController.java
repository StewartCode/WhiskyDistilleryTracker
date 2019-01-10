package com.codeclan.example.whiskydistillery.controllers;

import com.codeclan.example.whiskydistillery.models.Distillery;
import com.codeclan.example.whiskydistillery.models.Whisky;
import com.codeclan.example.whiskydistillery.repositories.DistilleryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/distilleries")
public class DistilleryController {

    @Autowired
    DistilleryRepository distilleryRepository;

    @GetMapping(value = "/whiskiesfordistilleries/{id}")
    public List<Whisky> getWhiskiesForDistilleries(@PathVariable Long id){
        Optional<Distillery> foundDistillery = distilleryRepository.findById(id);
        Distillery distillery = foundDistillery.get();
        return distilleryRepository.findAllWhiskies(distillery);
    }

    @GetMapping(value = "/getalldistilleriesforaparticularregion/{region}")
    public List<Distillery> findAllWhiskiesByRegion(@PathVariable String region){

        return distilleryRepository.findAllDistilleries(region);
    }


}
