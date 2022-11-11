package com.co.intevo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.co.intevo.models.ContratoModel;

@Repository
public interface ContratoRepository extends CrudRepository<ContratoModel, Long> {
    
}
