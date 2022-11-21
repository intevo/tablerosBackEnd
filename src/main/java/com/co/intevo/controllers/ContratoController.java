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
import com.co.intevo.models.ContratoModel;
import com.co.intevo.services.ContratoService;

@RestController
@RequestMapping("/contrato")
public class ContratoController {
    @Autowired
    ContratoService contratoService;

    @GetMapping()
    public ArrayList<ContratoModel> getContrato(){
        return contratoService.getContrato();
    }
    @PostMapping(path="/insert")
    public ContratoModel setContrato(@RequestBody ContratoModel contrato){
        return this.contratoService.setContrato(contrato);
    }

    @GetMapping(path="/{id}")
    public Optional<ContratoModel> getcontratoById(@PathVariable("id") Long id){
        return this.contratoService.getContratoById(id);
    }

    @DeleteMapping(path="/{id}")
    public String deletecontrato(@PathVariable("id") Long id){
        boolean ok = this.contratoService.deleteContrato(id);
        if(ok){
            return "contrato eliminado exitosamente " + id;
        } else{
            return "Error al eliminar contrato " + id;
        }
    }
    
}
