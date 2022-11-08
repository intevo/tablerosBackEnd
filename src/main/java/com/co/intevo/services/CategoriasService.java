package com.co.intevo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.co.intevo.models.CategoriasModel;
import com.co.intevo.repositories.CategoriasRepository;

@Service
public class CategoriasService {
    @Autowired
    CategoriasRepository categoriasRepository;

    public ArrayList<CategoriasModel> getCategoria(){
        return (ArrayList<CategoriasModel>) categoriasRepository.findAll();
    }

    public CategoriasModel setCategoria(CategoriasModel ans){
        return categoriasRepository.save(ans);
    }

    public Optional<CategoriasModel> getCategoriaById(Long id){
        return categoriasRepository.findById(id);
    }

    public boolean deleteCategoria(Long id){
        try{
            categoriasRepository.deleteById(id);
            return true;
        } catch(Exception e){
            return false;
        }
    }

}
