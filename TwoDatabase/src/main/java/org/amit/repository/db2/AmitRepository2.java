package org.amit.repository.db2;

import org.amit.model.db1.AmitTable;
import org.amit.model.db2.AmitTable2;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AmitRepository2 extends JpaRepository<AmitTable,Long> {
}
