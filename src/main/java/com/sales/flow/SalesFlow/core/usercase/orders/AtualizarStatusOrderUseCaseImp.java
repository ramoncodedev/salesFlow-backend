package com.sales.flow.SalesFlow.core.usercase.orders;

import com.sales.flow.SalesFlow.core.entities.pedidos.Pedidos;
import com.sales.flow.SalesFlow.core.entities.pedidos.PedidosStatus;
import com.sales.flow.SalesFlow.core.gateway.OrderRepository;
import java.util.Optional;

public class AtualizarStatusOrderUseCaseImp implements AtualizarStatusOrderUseCase {

    private final OrderRepository orderRepository;

    public AtualizarStatusOrderUseCaseImp(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Pedidos executar(Long id, PedidosStatus status) {
        Optional<Pedidos> orderOpt = orderRepository.buscarPorId(id);
        if (orderOpt.isEmpty()) {
            throw new RuntimeException("Order não encontrada com ID: " + id);
        }
        Pedidos order = orderOpt.get();
        order.setStatus(status);
        return orderRepository.atualizar(order);
    }
}