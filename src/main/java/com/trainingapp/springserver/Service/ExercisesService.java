package com.trainingapp.springserver.Service;

import com.trainingapp.springserver.Service.Repository.ExercisesRepository;
import com.trainingapp.springserver.model.Exercise;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExercisesService {

    private final ExercisesRepository repository;

    public ExercisesService(ExercisesRepository repository) {
        this.repository = repository;
    }

    public void saveExercise(Exercise exercise) {
        repository.save(exercise);
    }

    public List<Exercise> getAllExercise(){
        List<Exercise> Clients = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(Clients::add);
        return Clients;
    }

    public void delete(Exercise exercise) {
        repository.delete(exercise);
    }
}
