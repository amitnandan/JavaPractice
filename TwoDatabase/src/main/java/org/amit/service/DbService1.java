package org.amit.service;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.amit.model.db1.AmitTable;
import org.amit.model.db2.AmitTable2;
import org.amit.repository.db1.AmitRepository1;
import org.springframework.stereotype.Service;
import org.springframework.transaction.UnexpectedRollbackException;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Slf4j
@AllArgsConstructor
public class DbService1 {

    private AmitRepository1 amitRepository1;

    private DbService2 dbService2;

    @Transactional()
    public void update(long id , AmitTable amitTable){
        Optional<AmitTable> receivedVAlue = amitRepository1.findById(id);
        if(receivedVAlue.isEmpty())
            throw new RuntimeException("Object Not Present");
        AmitTable receivedTableValue = receivedVAlue.get();
       receivedTableValue.setAge(receivedTableValue.getAge() + 1);
        log.info("UPDATE START");

        amitRepository1.save(receivedTableValue);
        log.info("UPDATE END");


        AmitTable2 amitTable2 = new AmitTable2();
        amitTable2.setName("AABB");
        amitTable2.setAge("23");
        log.info("UPDATE HAPPENED");

            dbService2.update2(1, "AMIT");

    }

}
