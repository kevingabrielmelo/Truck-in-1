package com.backend.truckin.controllers;

import com.backend.truckin.models.User;
import com.backend.truckin.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class menuUserController {


    @RequestMapping("menuUser")
    public String menuUser()
    {
        return "menuUser";
    }
   /*@RequestMapping(value = "getAllUsers", method = RequestMethod.GET)
    public String allUsers(){
        return "allUsers";
    }*/
}
