package com.sales.flow.SalesFlow.core.usercase.orders;

import com.sales.flow.SalesFlow.core.entities.pedidos.Pedidos;

public interface CriarOrderUseCase {
    Pedidos executar(Pedidos order);
}