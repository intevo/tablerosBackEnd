package com.co.intevo.controllers;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.co.intevo.models.ContratoModel;
import com.co.intevo.models.FacturaModel;
import com.co.intevo.services.AnsService;
import com.co.intevo.services.ContratoService;
import com.co.intevo.services.FacturaService;

@RestController
@RequestMapping("/contrato")
public class ContratoController {
    @Autowired
    ContratoService contratoService;
    @Autowired
    FacturaService facturaService;
    @Autowired
    AnsService ansService;

    @GetMapping()
    public ArrayList<ContratoModel> getContrato(){
        return contratoService.getContrato();
    }
    @PostMapping(path="/insert")
    public ContratoModel setContrato(@RequestBody ContratoModel contrato){
        return this.contratoService.setContrato(contrato);
    }

    @GetMapping(path="/{id}")
    public Optional<ContratoModel> getContratoById(@PathVariable("id") Long id){
        return this.contratoService.getContratoById(id);
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @PutMapping(path="/{id}")
    public ContratoModel update(@RequestBody ContratoModel contrato){
        return contratoService.save(contrato);
    }

    //@CrossOrigin(origins = "http://localhost:8080")
    @GetMapping(path="/delete/{id}")
    public String deleteAns(@PathVariable("id") Long id){

        ArrayList<FacturaModel> factura = facturaService.getFactura();
        
        factura.forEach((e)->{
            if(e.getContrato() == id){
                this.facturaService.deleteFactura(e.getIdFactura());
                
            }
        });

        boolean ok = this.contratoService.deleteContrato(id);
        if(ok){
            return "Contrato eliminado exitosamente " + id;
        } else{
            return "Contrato al eliminar Factura " + id;
        }
    }
}
