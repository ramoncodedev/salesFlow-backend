package com.sales.flow.SalesFlow.core.usercase.customers;

import com.sales.flow.SalesFlow.core.entities.users.customers.Customers;

public interface CriarCustomersUserCase {

    Customers execute(Customers customer);

    Customers findByEmail(String email);
}