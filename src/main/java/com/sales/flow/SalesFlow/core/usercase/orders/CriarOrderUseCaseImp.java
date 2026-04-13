package com.sales.flow.SalesFlow.core.usercase.orders;

import com.sales.flow.SalesFlow.core.entities.pedidos.Pedidos;
import com.sales.flow.SalesFlow.core.gateway.OrderRepository;
import java.time.LocalDateTime;

public class CriarOrderUseCaseImp implements CriarOrderUseCase {

    private final OrderRepository orderRepository;

    public CriarOrderUseCaseImp(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Pedidos executar(Pedidos order) {
        order.setDataPedido(LocalDateTime.now());
        order.setStatus(com.sales.flow.SalesFlow.core.entities.pedidos.PedidosStatus.PENDENTE);
        return orderRepository.salvar(order);
    }
}