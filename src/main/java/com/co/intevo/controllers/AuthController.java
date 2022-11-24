package com.co.intevo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.co.intevo.models.UserModel;
import com.co.intevo.services.AuthService;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    AuthService authService;

    @GetMapping() //path="/getAll"
    public ArrayList<UserModel> getUsers(){
        return authService.getUsers();
    }

    @PostMapping(path="/insert")
    public UserModel setUser(@RequestBody UserModel user){
        return this.authService.setUser(user);
    }

    // @PostMapping()
    // public UserModel Auth(@RequestBody UserModel user){

    //     return this.authService.setUser(user);
    // }    
}
