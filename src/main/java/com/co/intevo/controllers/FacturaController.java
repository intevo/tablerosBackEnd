package com.co.intevo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.co.intevo.models.FacturaModel;
import com.co.intevo.services.FacturaService;

@RestController
@RequestMapping("/factura")
public class FacturaController {
    @Autowired
    FacturaService facturaService;

    @GetMapping()
    public ArrayList<FacturaModel> getFactura(){
        return facturaService.getFactura();
    }

    @PostMapping()
    public FacturaModel setFactura(@RequestBody FacturaModel factura){
        return this.facturaService.setFactura(factura);
    }
}