package com.trainingapp.springserver.controller;

import com.trainingapp.springserver.Service.CompetitionService;
import com.trainingapp.springserver.model.Competition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class competitionController {

    @Autowired
    private CompetitionService CompetitionService;

    @GetMapping("/competitions/get-all")
    public List<Competition> getClient() {
        return CompetitionService.getAllCompetitions();
    }

    @PostMapping("/competition/save")
    public void saveClient(@RequestBody Competition competition) {
        CompetitionService.saveCompetition(competition);
    }
}
