package com.co.intevo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.co.intevo.models.UserModel;
import com.co.intevo.repositories.UserRepository;

@Service
public class AuthService {
    @Autowired
    UserRepository userRepository;

    public ArrayList<UserModel> getUsers(){
        return (ArrayList<UserModel>) userRepository.findAll();
    }

    // public ArrayList<UserModel> getUser(UserModel user){
    //     return (ArrayList<UserModel>) userRepository.findAll();
    // }

    public UserModel setUser(UserModel ans){
        return userRepository.save(ans);
    }

}
