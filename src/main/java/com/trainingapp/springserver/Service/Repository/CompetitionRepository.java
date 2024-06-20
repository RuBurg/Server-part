package com.trainingapp.springserver.Service.Repository;

import com.trainingapp.springserver.model.Competition;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompetitionRepository extends CrudRepository<Competition, Integer>{
}
