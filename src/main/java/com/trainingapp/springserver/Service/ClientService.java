package com.trainingapp.springserver.Service;

import com.trainingapp.springserver.Service.Repository.ClientRepository;
import com.trainingapp.springserver.model.Client;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {

    private final ClientRepository repository;

    public ClientService(ClientRepository repository) {
        this.repository = repository;
    }

    public void save(Client client) {
        repository.save(client);
    }

    public List<Client> getAllClients(){
        List<Client> Clients = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(Clients::add);
        return Clients;
    }

   public void delete(Client client) {
        repository.delete(client);
   }
}
