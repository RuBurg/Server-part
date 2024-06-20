package com.trainingapp.springserver.controller;

import com.trainingapp.springserver.Service.ExercisesService;
import com.trainingapp.springserver.model.Exercise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class exercisesController {

    @Autowired
    private ExercisesService exercisesService;

    @GetMapping("/exercise/get-all")
    public List<Exercise> getExercise() {
        return exercisesService.getAllExercise();
    }

    @PostMapping("/exercise/save")
    public void saveExercise(@RequestBody Exercise exercise) {
        exercisesService.saveExercise(exercise);
    }

}
