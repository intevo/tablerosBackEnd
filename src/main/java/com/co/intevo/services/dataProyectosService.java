package com.co.intevo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.co.intevo.models.dataProyectosModel;
import com.co.intevo.repositories.dataProyectosRepository;

@Service
public class dataProyectosService {
    @Autowired
    dataProyectosRepository dataProyectosRepository;

    public ArrayList<dataProyectosModel> getdataProyectos(){
        return (ArrayList<dataProyectosModel>) dataProyectosRepository.findAll();
    }

    public dataProyectosModel setdataProyectos(dataProyectosModel dataProyectos){
        return dataProyectosRepository.save(dataProyectos);
    }

    public Optional<dataProyectosModel> getdataProyectosById(Long id){
        return dataProyectosRepository.findById(id);
    }

    public boolean deletedataProyectos(Long id){
        try{
            dataProyectosRepository.deleteById(id);
            return true;
        } catch(Exception e){
            return false;
        }
    }

}
