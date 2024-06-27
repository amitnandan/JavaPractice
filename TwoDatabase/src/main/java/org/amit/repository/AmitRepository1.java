package org.amit.repository;

import org.amit.model.AmitTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

public interface AmitRepository1 extends JpaRepository<AmitTable, Long> {

}
