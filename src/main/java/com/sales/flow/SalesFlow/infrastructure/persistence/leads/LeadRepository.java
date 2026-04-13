package com.sales.flow.SalesFlow.infrastructure.persistence.leads;

import com.sales.flow.SalesFlow.core.entities.leads.LeadStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LeadRepository extends JpaRepository<LeadEntity, Long> {


    List<LeadEntity> findByStatus(LeadStatus status);
}