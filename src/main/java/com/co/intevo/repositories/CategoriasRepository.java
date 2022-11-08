package com.co.intevo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.co.intevo.models.CategoriasModel;

@Repository
public interface CategoriasRepository extends CrudRepository<CategoriasModel, Long>{
    
}

