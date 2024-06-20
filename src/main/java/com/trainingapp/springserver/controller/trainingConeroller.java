package com.trainingapp.springserver.controller;

import com.trainingapp.springserver.Service.TrainingService;
import com.trainingapp.springserver.model.Training;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class trainingConeroller {

    @Autowired
    private TrainingService trainingService;

    @GetMapping("/training/get-all")
    public List<Training> getTraining() {
        return trainingService.getAllTraining();
    }

    @PostMapping("/training/save")
    public void saveTraining(@RequestBody Training training) {
        trainingService.saveTraining(training);
    }
}
