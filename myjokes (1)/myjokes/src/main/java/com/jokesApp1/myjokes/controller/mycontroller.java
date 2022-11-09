package com.jokesApp1.myjokes.controller;

import com.jokesApp1.myjokes.service.JokesService;
import com.jokesApp1.myjokes.service.JokesServiceImpl;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class mycontroller {

    private final JokesService jokesService;

    public mycontroller(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping({"/",""})
    public String myMethod( Model model ) {
        JokesServiceImpl jokesService = new JokesServiceImpl();
        model= model.addAttribute("myjoke", jokesService.getJoke());
        return "index";
    }

}
