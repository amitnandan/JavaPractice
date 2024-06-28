package org.amit.config;

import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.CannotGetJdbcConnectionException;

import java.net.ConnectException;
import java.sql.SQLException;
import java.sql.SQLTransientConnectionException;

@Configuration
public class CircuitBreakerConfiguration {

    @Bean
    public CircuitBreakerConfig backendServiceCircuitBreakerConfig() {
        return CircuitBreakerConfig.custom()
                .failureRateThreshold(10)
                .slidingWindowType(CircuitBreakerConfig.SlidingWindowType.COUNT_BASED)
                .slidingWindowSize(4)
                .minimumNumberOfCalls(2)
                .recordExceptions(SQLException.class, CannotGetJdbcConnectionException.class, SQLTransientConnectionException.class, ConnectException.class)
                .build();
    }
}
//CannotCreateTransactionException