package com.trainingapp.springserver.Service.Repository;

import com.trainingapp.springserver.model.Training;
import org.springframework.data.repository.CrudRepository;

public interface TrainigRepository extends CrudRepository<Training, Integer> {
}
