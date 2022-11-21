package com.co.intevo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.co.intevo.models.RegistroModel;
import com.co.intevo.repositories.RegistroRepository;

@Service
public class RegistroService {
    @Autowired
    RegistroRepository registroRepository;

    public ArrayList<RegistroModel> getRegistro(){
        return (ArrayList<RegistroModel>) registroRepository.findAll();
    }

    public RegistroModel setRegistro(RegistroModel registro){
        return registroRepository.save(registro);
    }

    public Optional<RegistroModel> getRegistroById(Long id){
        return registroRepository.findById(id);
    }

    public boolean deleteRegistro(Long id){
        try{
            registroRepository.deleteById(id);
            return true;
        } catch(Exception e){
            return false;
        }
    }
}
