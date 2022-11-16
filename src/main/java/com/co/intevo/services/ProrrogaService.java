package com.co.intevo.services;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.co.intevo.repositories.ProrrogaRepository;
import com.co.intevo.models.ProrrogaModel;

@Service
public class ProrrogaService {
    @Autowired
    static
    ProrrogaRepository ProrrogaRepository;

    public static ArrayList<ProrrogaModel> getProrroga() {
        return (ArrayList<ProrrogaModel>) ProrrogaRepository.findAll();
    }

    
    public ProrrogaModel setProrroga(ProrrogaModel prorroga){
        return ProrrogaRepository.save(prorroga);
    }

    public Optional<ProrrogaModel> getProrrogaById(Long id){
        return ProrrogaRepository.findById(id);
    }

    public boolean deleteProrroga(Long id){
        try{
            ProrrogaRepository.deleteById(id);
            return true;
        } catch(Exception e){
            return false;
        }
    }
}
