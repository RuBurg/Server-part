package com.trainingapp.springserver.Service.Repository;

import com.trainingapp.springserver.model.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DefaultRepository extends CrudRepository<Client, Integer> { }
