package com.codeclan.example.whiskydistillery.repositories;

import com.codeclan.example.whiskydistillery.models.Distillery;
import com.codeclan.example.whiskydistillery.models.Whisky;
//import com.sun.org.apache.xpath.internal.operations.String;

import java.util.List;

public interface WhiskyRepositoryCustom {

    List<Whisky> findAllWhiskiesByYear(int Year);

    List<Whisky> findAllWhiskiesByRegion(String region);

    List<Whisky> findAllWhiskiesByDistilleryAndAge(String distillery, int age);
}
