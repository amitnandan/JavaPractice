package org.amit.repository;

import jakarta.persistence.LockModeType;
import org.amit.model.AmitTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.stereotype.Repository;

public interface AmitRepository2 extends JpaRepository<AmitTable,Long> {
}
