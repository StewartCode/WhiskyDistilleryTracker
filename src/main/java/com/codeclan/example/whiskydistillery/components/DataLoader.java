package com.codeclan.example.whiskydistillery.components;

import com.codeclan.example.whiskydistillery.models.Distillery;
import com.codeclan.example.whiskydistillery.models.Whisky;
import com.codeclan.example.whiskydistillery.repositories.DistilleryRepository;
import com.codeclan.example.whiskydistillery.repositories.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    DistilleryRepository distilleryRepository;

    @Autowired
    WhiskyRepository whiskyRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){

        Distillery distillery1 = new Distillery("the best distiller", "borders");
        distilleryRepository.save(distillery1);

        Distillery distillery2 = new Distillery("the worst distiller", "highlands");
        distilleryRepository.save(distillery2);

        Distillery distillery3 = new Distillery("the no bad distiller", "islands");
        distilleryRepository.save(distillery3);

        Whisky faceMelter = new Whisky("face melter", distillery1, 1984, 30);
        whiskyRepository.save(faceMelter);

        Whisky beardStomper = new Whisky("beard stomper", distillery2, 1994, 25);
        whiskyRepository.save(beardStomper);

        Whisky frozenGrouse = new Whisky("frozen grouse", distillery3, 1994, 20);
        whiskyRepository.save(frozenGrouse);

        Whisky stomachRot = new Whisky("stomach rot", distillery1, 1984, 20);
        whiskyRepository.save(stomachRot);

        Whisky mildPanic = new Whisky("mild panic", distillery2, 1984, 30);
        whiskyRepository.save(mildPanic);

        Whisky betterDriver = new Whisky("better driver", distillery3, 1999, 20);
        whiskyRepository.save(betterDriver);

        distillery1.addWhiskey(faceMelter);
        distillery1.addWhiskey(stomachRot);
        distilleryRepository.save(distillery1);

        distillery2.addWhiskey(beardStomper);
        distillery2.addWhiskey(mildPanic);
        distilleryRepository.save(distillery2);

        distillery3.addWhiskey(frozenGrouse);
        distillery3.addWhiskey(betterDriver);
        distilleryRepository.save(distillery3);
    }
}
