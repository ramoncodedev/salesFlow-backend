package com.sales.flow.SalesFlow.infrastructure.presentation;

import com.sales.flow.SalesFlow.core.entities.users.customers.Customers;
import com.sales.flow.SalesFlow.core.usercase.customers.BuscarCustomerPorIdUseCase;
import com.sales.flow.SalesFlow.core.usercase.customers.ListarCustomersUserCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final ListarCustomersUserCase listarCustomersUseCase;
    private final BuscarCustomerPorIdUseCase buscarCustomerPorIdUseCase;



    @GetMapping
    public ResponseEntity<List<Customers>> listarCustomers() {
        List<Customers> customers = listarCustomersUseCase.listarCustomers();
        return ResponseEntity.ok(customers);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customers> buscarCustomer(@PathVariable Long id) {
        Customers customer = buscarCustomerPorIdUseCase.executar(id);
        return ResponseEntity.ok(customer);
    }
}