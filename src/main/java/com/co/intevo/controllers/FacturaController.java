package com.co.intevo.controllers;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.co.intevo.models.AnsModel;
import com.co.intevo.models.FacturaModel;
import com.co.intevo.services.AnsService;
import com.co.intevo.services.FacturaService;

@RestController
@RequestMapping("/factura")
public class FacturaController {
    @Autowired
    FacturaService facturaService;
    @Autowired
    AnsService ansService;

    @GetMapping()
    public ArrayList<FacturaModel> getFactura(){
        return facturaService.getFactura();
    }

    @PostMapping()
    public FacturaModel setFactura(@RequestBody FacturaModel factura){
        return this.facturaService.setFactura(factura);
    }

    @PostMapping(path="/update")
    public FacturaModel updateFactura(@RequestBody FacturaModel factura){
        return this.facturaService.setFactura(factura);
    }

    @GetMapping(path="/{idFactura}")
    public Optional<FacturaModel> getFacturaById(@PathVariable("idFactura") Long id){
        return this.facturaService.getFacturaById(id);
    }

    @PostMapping("/factura")
    public FacturaModel findById(@PathVariable String id){
        return facturaService.findById(id).get(); 
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @PutMapping(path="/{id}")
    public FacturaModel update(@RequestBody FacturaModel factura){
        return facturaService.save(factura);
    }

    // @CrossOrigin(origins = "http://localhost:8080")
	// @DeleteMapping(path="/{id}")
	@GetMapping(path="/delete/{id}")
    public String deleteAns(@PathVariable("id") Long id){

        ArrayList<AnsModel> ans = ansService.getAns();
        // return this.ansService.getAns();
        

        ans.forEach((e)->{
            if(e.getFactura() == id){
                this.ansService.deleteAns(e.getIdAns());
                // return e;
            }
        });

        // return ans.get(0);

        boolean ok = this.facturaService.deleteFactura(id);
        if(ok){
            return "Factura eliminado exitosamente " + id;
        } else{
            return "Error al eliminar Factura " + id;
        }
    }
}

