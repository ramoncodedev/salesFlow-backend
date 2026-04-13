package com.sales.flow.SalesFlow.core.entities.pedidos;

public enum PedidosStatus {

    PENDENTE,
    PAGO,
    CANCELADO;

    public static PedidosStatus fromString(String status) {
        for (PedidosStatus pedidosStatus : PedidosStatus.values()) {
            if (pedidosStatus.name().equalsIgnoreCase(status)) {
                return pedidosStatus;
            }
        }
        throw new IllegalArgumentException("Status de pedido inválido: " + status);
    }
}