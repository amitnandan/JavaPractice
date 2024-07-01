package org.amit.controller;


import lombok.AllArgsConstructor;
import org.amit.model.db1.AmitTable;
import org.amit.model.db2.AmitTable2;
import org.amit.service.AmitService;
import org.amit.service.DbService1;
import org.amit.service.DbService2;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
public class Dbcontroller {

    private AmitService amitService;
    private DbService2 dbService2;
    private DbService1 dbService1;

//    private DatabaseServiceHealthCheck databaseServiceHealthCheck;

    @GetMapping
    public String processRequest(){
//        if(databaseServiceHealthCheck.isDatabaseUp())
            amitService.performDb1Transaction();
//        else
//            return "Failure DB is down";
        return "Success";
    }

    @PostMapping("/1/{id1}")
    public String processRequest1(@PathVariable("id1") long id , @RequestBody AmitTable amitTable){
//        if(databaseServiceHealthCheck.isDatabaseUp())
//        else
//            return "Failure DB is down";
        dbService1.update(id,amitTable);
        return "Success";
    }
    @PostMapping("/2/{id2}")
    public String processRequest2(@PathVariable("id2") long id , @RequestBody AmitTable2 amitTable){
//        if(databaseServiceHealthCheck.isDatabaseUp())
//        else
//            return "Failure DB is down";
        dbService2.update(id,amitTable);
        return "Success";
    }
}
