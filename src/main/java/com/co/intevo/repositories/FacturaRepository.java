package com.co.intevo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.co.intevo.models.FacturaModel;

@Repository
public interface FacturaRepository extends CrudRepository<FacturaModel, Long> {
    
}
