/*
package org.amit.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.Status;
import org.springframework.boot.actuate.jdbc.DataSourceHealthIndicator;
import org.springframework.jdbc.CannotGetJdbcConnectionException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component("db1HealthIndicator")
public class DB1HealthIndicator extends DataSourceHealthIndicator {


    @Autowired
    @Qualifier("db1DataSource")
    private DataSource dataSource;



    private void doDataSourceHealthCheck(Health.Builder builder) {
        DataSourceHealthIndicator db = new DataSourceHealthIndicator(dataSource);
        Health status = new Health();


    }
*/
