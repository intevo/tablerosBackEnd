package com.co.intevo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.co.intevo.models.dataProyectosModel;
import com.co.intevo.services.dataProyectosService;


@RestController
@RequestMapping("/dataProyectos")
public class dataProyectosController {
    @Autowired
    dataProyectosService dataProyectosService;

    @GetMapping()
    public ArrayList<dataProyectosModel> getdataProyectos(){
        return dataProyectosService.getdataProyectos();
    }

    @PostMapping()
    public dataProyectosModel setFactura(@RequestBody dataProyectosModel dataProyectos){
        return this.dataProyectosService.setdataProyectos(dataProyectos);
    }
}
