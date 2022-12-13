package com.co.intevo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.co.intevo.models.AnsModel;
import com.co.intevo.repositories.AnsRepository;

@Service
public class AnsService {
    @Autowired
    AnsRepository ansRepository;

    public ArrayList<AnsModel> getAns(){
        return (ArrayList<AnsModel>) ansRepository.findAll();
    }
    
    public AnsModel setAns(AnsModel ans){
        return ansRepository.save(ans);
    }

    public Optional<AnsModel> getAnsById(Long id){
        return ansRepository.findById(id);
    }

    public boolean deleteAns(Long id){
        try{
            ansRepository.deleteById(id);
            return true;
        } catch(Exception e){
            return false;
        }
    }

    public Optional<AnsModel> findById(String id) {
        return null;
    }

    public AnsModel save(AnsModel ans) {
        return ansRepository.save(ans);
    }
}
