package com.co.intevo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.co.intevo.models.RegistroModel;

@Repository
public interface RegistroRepository extends CrudRepository<RegistroModel, Long> {
    
}
