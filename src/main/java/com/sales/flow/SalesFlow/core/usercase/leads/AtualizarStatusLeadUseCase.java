package com.sales.flow.SalesFlow.core.usercase.leads;

import com.sales.flow.SalesFlow.core.entities.leads.Lead;
import com.sales.flow.SalesFlow.core.entities.leads.LeadStatus;

public interface AtualizarStatusLeadUseCase {

    Lead executar(Long id, LeadStatus status);
}