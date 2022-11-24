package com.co.intevo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.co.intevo.models.UserModel;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Long>{
    
}
