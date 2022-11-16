package com.co.intevo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.co.intevo.models.ProrrogaModel;
import com.co.intevo.services.ProrrogaService;

@RestController
@RequestMapping("/prorroga")
public class  ProrrogaController{
    @Autowired
    ProrrogaService facturaService;
    private Object prorrogaService;

    @GetMapping()
    public ArrayList<ProrrogaModel> getProrroga(){
        return ProrrogaService.getProrroga();
    }

    @PostMapping()
    public ProrrogaModel setProrroga(@RequestBody ProrrogaModel progrroga){
        return ((ProrrogaController) this.prorrogaService).setProrroga(progrroga);
    }
}
