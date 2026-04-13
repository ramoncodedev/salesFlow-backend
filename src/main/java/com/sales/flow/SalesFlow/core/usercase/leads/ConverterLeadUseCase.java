package com.sales.flow.SalesFlow.core.usercase.leads;

import com.sales.flow.SalesFlow.core.entities.users.customers.Customers;

public interface ConverterLeadUseCase {
    Customers executar(Long leadId);
}