package com.co.intevo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.co.intevo.models.dataProyectosModel;

@Repository
public interface dataProyectosRepository extends CrudRepository<dataProyectosModel, Long>{
    
}

