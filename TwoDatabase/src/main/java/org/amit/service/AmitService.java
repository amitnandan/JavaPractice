package org.amit.service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.extern.slf4j.Slf4j;
import org.amit.model.db1.AmitTable;
import org.amit.model.db2.AmitTable2;
import org.amit.repository.db1.AmitRepository1;
import org.amit.repository.db2.AmitRepository2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Slf4j
@Service
public class AmitService {

    @Autowired
    private  AmitRepository1 amitRepository1;

//    @Autowired
//    private  AmitRepository2 amitRepository2;


    //Resilience4j's Circuit Breaker triggers the fallback method not only for exceptions occurring within the annotated method's scope but also for errors that occur in the call stack outside of it, ensuring backward compatibility.
    @CircuitBreaker(name = "backendB", fallbackMethod = "fallback2")
    @Transactional(transactionManager = "db1TransactionManager")
    public void performDb1Transaction() {
        log.info("INSIDE perfromDB1Transcation");
        AmitTable amitTable = new AmitTable();
        amitTable.setName("Amit");
        amitTable.setAge("21");
        try {
            amitRepository1.save(amitTable);
        }catch (Exception e){
            log.info("INSIDE EXCEPTION");
            log.info(e.getMessage());
            log.error(String.valueOf(e.getClass()),e);
        }
    }



//    @Transactional(transactionManager = "db2TransactionManager")
//    public void performDb2Transaction() {
//        AmitTable amitTable2 = new AmitTable();
//        amitTable2.setName("Amit");
//        amitTable2.setAge("23");
//        amitRepository2.save(amitTable2);
//    }
    public void fallback2(Throwable throwable) {
        log.info("INSIDE FALLBACK");
        log.error("Fallback response: " + throwable);
    }

}
