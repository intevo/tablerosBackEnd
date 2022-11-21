package com.co.intevo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.co.intevo.models.RegistroModel;
import com.co.intevo.services.RegistroService;

@RestController
@RequestMapping("/registro")
public class RegistroController {

    @Autowired
    RegistroService registroService;

    @GetMapping()
    public ArrayList<RegistroModel> getRegistro(){
        return registroService.getRegistro();
    }

    @PostMapping()
    public RegistroModel setRegistro(@RequestBody RegistroModel registro){
        return this.registroService.setRegistro(registro);
    }

    @GetMapping(path="/{id}")
    public Optional<RegistroModel> getRegistroById(@PathVariable("id") Long id){
        return this.registroService.getRegistroById(id);
    }

    @DeleteMapping(path="/{id}")
    public String deleteRegistro(@PathVariable("id") Long id){
        boolean ok = this.registroService.deleteRegistro(id);
        if(ok){
            return "ANS eliminado exitosamente " + id;
        } else{
            return "Error al eliminar ANS " + id;
        }
    }

}

