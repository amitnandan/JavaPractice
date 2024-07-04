package org.redis.repository;

import org.redis.model.EmployeeAmit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface EmployeeRepo extends JpaRepository<EmployeeAmit, Long> {

}
