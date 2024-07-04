package org.redis.service;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.redis.model.EmployeeAmit;
import org.redis.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@AllArgsConstructor
@Slf4j
@Service
public class EmployeeAmitService implements EmployeeInterface{

    private EmployeeRepo employeeRepo;

    @Override
    public void update() {

    }

    @Override
    public void create() {
        log.info("Inside Create");
        EmployeeAmit employeeAmit = new EmployeeAmit();
        employeeAmit.setName("Amit");
        employeeAmit.setPassword("h");
        employeeAmit.setAmount("2000");
        employeeRepo.save(employeeAmit);
    }
}
