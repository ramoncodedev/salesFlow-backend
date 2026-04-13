package com.sales.flow.SalesFlow.core.usercase.leads;

import com.sales.flow.SalesFlow.core.entities.leads.Lead;
import com.sales.flow.SalesFlow.core.entities.leads.LeadStatus;
import java.util.List;

public interface CriarLeadUseCase {
    Lead executar(Lead lead);
}