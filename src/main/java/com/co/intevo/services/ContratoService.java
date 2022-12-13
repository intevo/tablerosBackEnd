package com.co.intevo.services;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.co.intevo.repositories.ContratoRepository;
import com.co.intevo.models.ContratoModel;

@Service
public class ContratoService {
    @Autowired
    ContratoRepository contratoRepository;

    public ArrayList<ContratoModel> getContrato() {
        return (ArrayList<ContratoModel>) contratoRepository.findAll();
    }

    
    public ContratoModel setContrato(ContratoModel contrato){
        return contratoRepository.save(contrato);
    }

    public Optional<ContratoModel> getContratoById(Long id){
        return contratoRepository.findById(id);
    }

    public boolean deleteContrato(Long id){
        try{
            contratoRepository.deleteById(id);
            return true;
        } catch(Exception e){
            return false;
        }
    }

    public ContratoModel save(ContratoModel contrato) {
        return contratoRepository.save(contrato);
    }
}
