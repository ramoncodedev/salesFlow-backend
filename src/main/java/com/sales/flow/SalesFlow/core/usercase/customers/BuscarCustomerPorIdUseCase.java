package com.sales.flow.SalesFlow.core.usercase.customers;

import com.sales.flow.SalesFlow.core.entities.users.customers.Customers;

public interface BuscarCustomerPorIdUseCase {
    Customers executar(Long id);
}