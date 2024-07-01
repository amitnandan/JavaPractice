package org.amit.config;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.transaction.ChainedTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class MultipleDatasourceTransactionManagerConfig {
    @Bean(name = "chainedTransactionManager")
    public ChainedTransactionManager chainedTransactionManager(
            @Qualifier("db1TransactionManager")
            PlatformTransactionManager accountingTransactionManager,
            @Qualifier("db2TransactionManager")
            PlatformTransactionManager warehouseTransactionManager ){
        return new ChainedTransactionManager(accountingTransactionManager,warehouseTransactionManager);
    }
}
