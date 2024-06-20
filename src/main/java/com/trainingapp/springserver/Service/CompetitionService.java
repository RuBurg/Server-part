package com.trainingapp.springserver.Service;


import com.trainingapp.springserver.Service.Repository.CompetitionRepository;
import com.trainingapp.springserver.model.Competition;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompetitionService {

    private final CompetitionRepository repository;

    public CompetitionService(CompetitionRepository repository) {
        this.repository = repository;
    }

    public void saveCompetition(Competition competition) {
       repository.save(competition);
    }

    public List<Competition> getAllCompetitions(){
        List<Competition> Competition = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(Competition::add);
        return Competition;
    }

    public void deleteCompetition(Competition competition) {
        repository.delete(competition);
    }
}
