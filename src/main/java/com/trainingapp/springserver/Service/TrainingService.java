package com.trainingapp.springserver.Service;

import com.trainingapp.springserver.Service.Repository.TrainigRepository;
import com.trainingapp.springserver.model.Training;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TrainingService {

    private final TrainigRepository repository;

    public TrainingService(TrainigRepository repository) {
        this.repository = repository;
    }

    public void saveTraining(Training training) {
        repository.save(training);
    }

    public List<Training> getAllTraining(){
        List<Training> Trainings = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(Trainings::add);
        return Trainings;
    }

    public void delete(Training training) {
        repository.delete(training);
    }

}
