package com.co.intevo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.co.intevo.models.CategoriasModel;
import com.co.intevo.services.CategoriasService;


@RestController
@RequestMapping("/categoria")
public class CategoriasController {
    @Autowired
    CategoriasService categoriaService;

    @GetMapping()
    public ArrayList<CategoriasModel> getCategoria(){
        return categoriaService.getCategoria();
    }

    @PostMapping()
    public CategoriasModel setFactura(@RequestBody CategoriasModel categoria){
        return this.categoriaService.setCategoria(categoria);
    }
}
