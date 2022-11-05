package com.SpringGuru.DIpractice.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("dog")
@Profile("{dog,default}")
public class DogPetService implements PetService{

    @Override
    public String getPetType() {
        return "Dogs are the best!";
    }
}
