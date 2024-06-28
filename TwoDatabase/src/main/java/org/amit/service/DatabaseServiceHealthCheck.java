//package org.amit.service;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.PersistenceContext;
//import jakarta.persistence.Query;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Service;
//
//@Slf4j
//@Service
//public class DatabaseServiceHealthCheck {
//    @PersistenceContext(name = "db1PersistenceUnit")
//    private EntityManager entityManager; // Inject EntityManager to execute queries
//
//    public boolean isDatabaseUp() {
//        try {
//            log.info("INSIDE HEALTH CHECK DB");
//            Query query = entityManager.createNativeQuery("SELECT 1");
//            query.getSingleResult(); // Execute a simple query to check database connectivity
//            return true; // If no exception, database is up
//        } catch (Exception e) {
//            // Log or handle the exception
//            log.info("INSIDE HEALTH CHECK DB EXCEPTION ");
////           log.error(e.getMessage(),e);
//            return false; // Database is down or not reachable
//        }
//    }
//}
