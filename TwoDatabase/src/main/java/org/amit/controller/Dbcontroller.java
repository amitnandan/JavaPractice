package org.amit.controller;


import lombok.AllArgsConstructor;
import org.amit.service.AmitService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class Dbcontroller {

    private AmitService amitService;

    @GetMapping
    public String processRequest(){
        amitService.performDb1Transaction();
        return "Success";
    }
}
