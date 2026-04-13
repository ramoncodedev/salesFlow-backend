package com.sales.flow.SalesFlow.core.usercase.orders;

import com.sales.flow.SalesFlow.core.entities.pedidos.Pedidos;
import com.sales.flow.SalesFlow.core.entities.pedidos.PedidosStatus;

public interface AtualizarStatusOrderUseCase {
    Pedidos executar(Long id, PedidosStatus status);
}