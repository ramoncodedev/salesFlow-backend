package com.sales.flow.SalesFlow.infrastructure.dtos;

import com.sales.flow.SalesFlow.core.entities.pedidos.PedidosStatus;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public record OrderRequest(
    BigDecimal valor,
    PedidosStatus status,
    LocalDateTime dataPedido,
    Long clienteId
) {}