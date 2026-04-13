package com.sales.flow.SalesFlow.core.gateway;

import com.sales.flow.SalesFlow.core.entities.users.customers.Customers;
import java.util.List;
import java.util.Optional;

public interface CustomerRepository {

    Customers salvar(Customers customer);
    
    Optional<Customers> buscarPorId(Long id);
    
    List<Customers> buscarTodos();
    
    void deletar(Long id);
    
    Customers atualizar(Customers customer);
}