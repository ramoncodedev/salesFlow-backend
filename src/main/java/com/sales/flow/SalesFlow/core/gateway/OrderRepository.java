package com.sales.flow.SalesFlow.core.gateway;

import com.sales.flow.SalesFlow.core.entities.pedidos.Pedidos;
import com.sales.flow.SalesFlow.core.entities.pedidos.PedidosStatus;

import java.util.List;
import java.util.Optional;

public interface OrderRepository {

    Pedidos salvar(Pedidos order);
    
    Optional<Pedidos> buscarPorId(Long id);
    
    List<Pedidos> buscarTodos();
    
    List<Pedidos> buscarPorStatus(PedidosStatus status);
    
    void deletar(Long id);
    
    Pedidos atualizar(Pedidos order);
}