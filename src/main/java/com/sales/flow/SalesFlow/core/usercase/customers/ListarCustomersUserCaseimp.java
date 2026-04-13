package com.sales.flow.SalesFlow.core.usercase.customers;

import com.sales.flow.SalesFlow.core.entities.users.customers.Customers;
import com.sales.flow.SalesFlow.core.gateway.CustomersGateway;

import java.util.List;

public class ListarCustomersUserCaseimp implements ListarCustomersUserCase {


     private final CustomersGateway customersGateway;

    public ListarCustomersUserCaseimp(CustomersGateway customersGateway) {
        this.customersGateway = customersGateway;
    }

    @Override
    public List<Customers> listarCustomers() {
        return customersGateway.findAll();
    }
}
