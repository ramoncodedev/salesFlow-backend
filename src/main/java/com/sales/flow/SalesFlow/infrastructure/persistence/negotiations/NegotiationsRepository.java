package com.sales.flow.SalesFlow.infrastructure.persistence.negotiations;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NegotiationsRepository extends JpaRepository<NegotiationsEntity, Long> {
    List<NegotiationsEntity> findByStatus(com.sales.flow.SalesFlow.core.entities.negotiations.NegotiationStatus status);
}