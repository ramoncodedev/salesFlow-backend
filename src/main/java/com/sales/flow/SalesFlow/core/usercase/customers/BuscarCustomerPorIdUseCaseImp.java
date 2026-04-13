package com.sales.flow.SalesFlow.core.usercase.customers;

import com.sales.flow.SalesFlow.core.entities.users.customers.Customers;
import com.sales.flow.SalesFlow.core.gateway.CustomerRepository;
import java.util.Optional;

public class BuscarCustomerPorIdUseCaseImp implements BuscarCustomerPorIdUseCase {

    private final CustomerRepository customerRepository;

    public BuscarCustomerPorIdUseCaseImp(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customers executar(Long id) {
        Optional<Customers> customer = customerRepository.buscarPorId(id);
        if (customer.isEmpty()) {
            throw new RuntimeException("Customer não encontrado com ID: " + id);
        }
        return customer.get();
    }
}