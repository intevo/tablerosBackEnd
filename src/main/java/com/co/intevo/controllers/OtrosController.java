package com.co.intevo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.co.intevo.models.OtrosModel;
import com.co.intevo.services.OtrosService;


@RestController
@RequestMapping("/otros")

public class OtrosController {
    
    @Autowired
    OtrosService otrosService;

    @GetMapping()
    public ArrayList<OtrosModel> getOtros(){
        return otrosService.getOtros();
    }

    @PostMapping()
    public OtrosModel setOtros(@RequestBody OtrosModel otros){
        return this.otrosService.setOtros(otros);
    }
}















