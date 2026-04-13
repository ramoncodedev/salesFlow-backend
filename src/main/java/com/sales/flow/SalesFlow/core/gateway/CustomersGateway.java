package com.sales.flow.SalesFlow.core.gateway;

import com.sales.flow.SalesFlow.core.entities.users.customers.Customers;

import java.util.List;

public interface CustomersGateway {

    public Customers criarCustomer(Customers customer);
    public List<Customers> buscarCustomerPorId(Long id);
    public List<Customers> findAll();
    public void deletarCustomer(Long id);
}
