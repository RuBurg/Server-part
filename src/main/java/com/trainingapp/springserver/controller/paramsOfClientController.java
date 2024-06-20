package com.trainingapp.springserver.controller;

import com.trainingapp.springserver.Service.ClientService;
import com.trainingapp.springserver.Service.ParamsOfClientsService;
import com.trainingapp.springserver.model.Params;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class paramsOfClientController {

    @Autowired
    private ParamsOfClientsService paramsOfClientsService;

    @GetMapping("/params/get-all")
    public List<Params> getParamsOfClients() {
        return paramsOfClientsService.getAllParams();
    }

    @PostMapping("/params/save")
    public void saveParamsOfClients(@RequestBody Params params) {
        paramsOfClientsService.saveParamsOfClients(params);
    }

}
