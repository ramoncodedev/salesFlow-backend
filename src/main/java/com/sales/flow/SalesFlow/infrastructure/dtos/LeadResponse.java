package com.sales.flow.SalesFlow.infrastructure.dtos;

import com.sales.flow.SalesFlow.core.entities.leads.LeadStatus;
import java.time.LocalDateTime;

public record LeadResponse(
    Long id,
    String nome,
    String email,
    String telefone,
    String empresa,
    LeadStatus status,
    LocalDateTime criadoEm,
    Long customerId
) {}