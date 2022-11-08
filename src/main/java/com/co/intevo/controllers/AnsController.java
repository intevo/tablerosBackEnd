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

import com.co.intevo.models.AnsModel;
import com.co.intevo.services.AnsService;

@RestController
@RequestMapping("/ans")
public class AnsController {
    @Autowired
    AnsService ansService;

    @GetMapping()
    public ArrayList<AnsModel> getAns(){
        return ansService.getAns();
    }

    @PostMapping()
    public AnsModel setAns(@RequestBody AnsModel ans){
        return this.ansService.setAns(ans);
    }

    @GetMapping(path="/{id}")
    public Optional<AnsModel> getAnsById(@PathVariable("id") Long id){
        return this.ansService.getAnsById(id);
    }

    @DeleteMapping(path="/{id}")
    public String deleteAns(@PathVariable("id") Long id){
        boolean ok = this.ansService.deleteAns(id);
        if(ok){
            return "ANS eliminado exitosamente " + id;
        } else{
            return "Error al eliminar ANS " + id;
        }
    }

}

