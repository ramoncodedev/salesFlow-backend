package com.sales.flow.SalesFlow.core.usercase.customers;

import com.sales.flow.SalesFlow.core.gateway.CustomersGateway;

public class DeletarCustomersUserCaseImp implements DeletarCustomersUserCase {

    private final CustomersGateway customersGateway;

    public DeletarCustomersUserCaseImp(CustomersGateway customersGateway) {
        this.customersGateway = customersGateway;
    }

    @Override
     public void deletarCustomers(Long id) {
        customersGateway.deletarCustomer(id);
     }
}
