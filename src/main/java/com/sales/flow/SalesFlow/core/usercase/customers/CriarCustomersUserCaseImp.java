package com.sales.flow.SalesFlow.core.usercase.customers;

import com.sales.flow.SalesFlow.core.entities.users.customers.Customers;
import com.sales.flow.SalesFlow.core.gateway.CustomersGateway;

public class CriarCustomersUserCaseImp implements CriarCustomersUserCase {


    private final CustomersGateway customersGateway;

    public CriarCustomersUserCaseImp(CustomersGateway customersGateway) {
        this.customersGateway = customersGateway;
    }

    @Override
    public Customers execute(Customers customer) {
        return customersGateway.criarCustomer(customer);
    }

    @Override
    public Customers findByEmail(String email) {
        return null;
    }
}