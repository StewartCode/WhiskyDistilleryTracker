package com.codeclan.example.whiskydistillery.repositories;

import com.codeclan.example.whiskydistillery.models.Distillery;
import com.codeclan.example.whiskydistillery.models.Whisky;

import java.util.List;

public interface DistilleryRepositoryCustom {

    public List<Whisky> findAllWhiskies(Distillery distillery);

    public List<Distillery> findAllDistilleries(String region);

}
