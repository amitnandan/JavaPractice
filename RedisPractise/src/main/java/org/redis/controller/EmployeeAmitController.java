package org.redis.controller;


import lombok.AllArgsConstructor;
import org.redis.service.EmployeeInterface;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
public class EmployeeAmitController{

    private EmployeeInterface employeeInterface;

    @PostMapping("")
    public String processRequest(){
        employeeInterface.create();
        return "Success";
    }

}
