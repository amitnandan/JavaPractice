//package org.amit.model;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.PersistenceContext;
//import jakarta.persistence.Query;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.boot.actuate.health.Health;
//import org.springframework.boot.actuate.health.HealthIndicator;
//import org.springframework.stereotype.Component;
//
//@Component
//@Slf4j
//public class CustomHealthIndicator implements HealthIndicator {
//    @PersistenceContext(name = "db1PersistenceUnit")
//    private EntityManager entityManager1; // Inject EntityManager to execute queries
//
//    @PersistenceContext(name = "db2PersistenceUnit")
//    private EntityManager entityManager2; // Inject EntityManager to execute queries
//
//
//    public boolean isDatabaseUp1() {
//        try {
//            log.info("INSIDE HEALTH CHECK DB1");
//            Query query = entityManager1.createNativeQuery("SELECT 1");
//            query.getSingleResult(); // Execute a simple query to check database connectivity
//            return true; // If no exception, database is up
//        } catch (Exception e) {
//            // Log or handle the exception
//            log.info("INSIDE HEALTH CHECK DB2 EXCEPTION ");
////           log.error(e.getMessage(),e);
//            return false; // Database is down or not reachable
//        }
//    }
//    public boolean isDatabaseUp2() {
//        try {
//            log.info("INSIDE HEALTH CHECK DB2");
//            Query query = entityManager2.createNativeQuery("SELECT 1");
//            query.getSingleResult(); // Execute a simple query to check database connectivity
//            return true; // If no exception, database is up
//        } catch (Exception e) {
//            // Log or handle the exception
//            log.info("INSIDE HEALTH CHECK DB2 EXCEPTION ");
////           log.error(e.getMessage(),e);
//            return false; // Database is down or not reachable
//        }
//    }
//        @Override
//    public Health health() {
//            boolean databaseUp1 = isDatabaseUp1();
//            boolean databaseUp2 = isDatabaseUp2();
//            log.info("DATABASE 1 is {}" , databaseUp1);
//            log.info("DATABASE 2 is {}" , databaseUp2);
//
//            return Health.up().build();
//
//        }
//}
//
