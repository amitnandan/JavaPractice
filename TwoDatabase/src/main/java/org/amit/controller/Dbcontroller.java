package org.amit.controller;


import lombok.AllArgsConstructor;
import org.amit.service.AmitService;
//import org.amit.service.DatabaseServiceHealthCheck;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class Dbcontroller {

    private AmitService amitService;

//    private DatabaseServiceHealthCheck databaseServiceHealthCheck;

    @GetMapping
    public String processRequest(){
//        if(databaseServiceHealthCheck.isDatabaseUp())
            amitService.performDb1Transaction();
//        else
//            return "Failure DB is down";
        return "Success";
    }
}
