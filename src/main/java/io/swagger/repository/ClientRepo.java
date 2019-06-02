package io.swagger.repository;

import io.swagger.model.Client;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClientRepo extends CrudRepository<Client, Integer> {

    List<Client> findAll();
}
