package com.trainingapp.springserver.controller;

import com.trainingapp.springserver.model.Client;
import com.trainingapp.springserver.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class clientController {

    @Autowired
    private ClientService ClientService;

    @GetMapping("/client/get-all")
    public List<Client> getClient() {
        return ClientService.getAllClients();
    }

    @PostMapping("/client/save")
    public void saveClient(@RequestBody Client client) {
        ClientService.save(client);
    }

}
