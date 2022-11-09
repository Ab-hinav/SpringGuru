package com.mypetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owners")
public class OwnerController {

    @RequestMapping({"","/", "/index", "/index.html", "/owners.html"})
    public String listOwners() {
        return "owners/index";
    }

}
