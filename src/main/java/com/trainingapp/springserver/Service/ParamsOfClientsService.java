package com.trainingapp.springserver.Service;

import com.trainingapp.springserver.Service.Repository.ParamsRepository;
import com.trainingapp.springserver.model.Params;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ParamsOfClientsService {

    private final ParamsRepository repository;

    public ParamsOfClientsService(ParamsRepository repository) {
        this.repository = repository;
    }

    public void saveParamsOfClients(Params params) {
        repository.save(params);
    }

    public List<Params> getAllParams(){
        List<Params> Params = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(Params::add);
        return Params;
    }

    public void delete(Params params) {
        repository.delete(params);
    }

}
