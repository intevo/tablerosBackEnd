package com.co.intevo.services;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.co.intevo.models.OtrosModel;
import com.co.intevo.repositories.OtrosRepository;

@Service
public class OtrosService {
    @Autowired
    OtrosRepository otrosRepository;

    public ArrayList<OtrosModel> getOtros(){
        return (ArrayList<OtrosModel>) otrosRepository.findAll();
    }

    public OtrosModel setOtros(OtrosModel otros){
        return otrosRepository.save(otros);
    }

    public Optional<OtrosModel> getCategoriaById(Long id){
        return otrosRepository.findById(id);
    }

    public boolean deleteOtros(Long id){
        try{
            otrosRepository.deleteById(id);
            return true;
        } catch(Exception e){
            return false;
        }
    }

}
