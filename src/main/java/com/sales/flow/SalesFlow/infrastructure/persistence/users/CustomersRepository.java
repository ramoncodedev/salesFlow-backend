package com.sales.flow.SalesFlow.infrastructure.persistence.users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomersRepository extends JpaRepository<CustomersEntity, Long> {
}
