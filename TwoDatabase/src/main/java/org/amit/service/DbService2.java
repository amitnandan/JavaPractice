package org.amit.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.amit.model.db1.AmitTable;
import org.amit.model.db2.AmitTable2;
import org.amit.repository.db2.AmitRepository2;
import org.springframework.stereotype.Service;
import org.springframework.transaction.UnexpectedRollbackException;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Slf4j
@AllArgsConstructor
public class DbService2 {

    private AmitRepository2 amitRepository2;

    public void update(long id, AmitTable2 amitTable) {
    }
    @Transactional(propagation = Propagation.REQUIRED)
    public void update2(long id, String name) {
        Optional<AmitTable2> receivedVAlue = amitRepository2.findById(id);
        if(receivedVAlue.isEmpty())
            throw new RuntimeException("Object Not Present");
        AmitTable2 receivedTableValue = receivedVAlue.get();
        receivedTableValue.setAge(receivedTableValue.getAge() + 1);
        receivedTableValue.setName(name);
        log.info("UPDATE.2");
        amitRepository2.save(receivedTableValue);
        log.info("UPDATE.2");
        Optional<AmitTable2> receivedVAlue2 = amitRepository2.findById(2L);
        if(receivedVAlue2.isEmpty())
            throw new RuntimeException("Object Not Present");
        //amitRepository2.save(receivedTableValue);

    }
}
