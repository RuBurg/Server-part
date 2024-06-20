package com.trainingapp.springserver.Service.Repository;

import com.trainingapp.springserver.model.Exercise;
import org.springframework.data.repository.CrudRepository;

public interface ExercisesRepository extends CrudRepository<Exercise, Integer> {
}
