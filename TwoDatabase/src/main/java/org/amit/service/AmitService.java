package org.amit.service;

import org.amit.model.AmitTable;
import org.amit.repository.AmitRepository1;
import org.amit.repository.AmitRepository2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AmitService {

    @Autowired
    private  AmitRepository1 amitRepository1;

    @Autowired
    private  AmitRepository2 amitRepository2;


    @Transactional(transactionManager = "db1TransactionManager")
    public void performDb1Transaction() {
        AmitTable amitTable = new AmitTable();
        amitTable.setName("Amit");
        amitTable.setAge("21");
        amitRepository1.save(amitTable);
    }

    @Transactional(transactionManager = "db2TransactionManager")
    public void performDb2Transaction() {
        AmitTable amitTable = new AmitTable();
        amitTable.setName("Amit");
        amitTable.setAge("23");
        amitRepository2.save(amitTable);
    }

}
