package com.SpringGuru.DIpractice.controllers;

import com.SpringGuru.DIpractice.service.PetService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class myPetController {

    private final PetService petService;

    public myPetController(@Qualifier("cat") PetService petService) {
        this.petService = petService;
    }

    public String whichPetIsTheBest() {
        return petService.getPetType();
    }


}
