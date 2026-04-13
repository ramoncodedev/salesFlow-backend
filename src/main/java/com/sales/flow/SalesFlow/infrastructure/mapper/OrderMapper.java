package com.sales.flow.SalesFlow.infrastructure.mapper;

import com.sales.flow.SalesFlow.core.entities.pedidos.Pedidos;
import com.sales.flow.SalesFlow.infrastructure.dtos.OrderRequest;
import com.sales.flow.SalesFlow.infrastructure.dtos.OrderResponse;
import com.sales.flow.SalesFlow.infrastructure.persistence.orders.OrderEntity;

public class OrderMapper {

    public static Pedidos toDomain(OrderEntity entity) {
        if (entity == null) return null;
        Pedidos order = new Pedidos();
        order.setId(entity.getId());
        order.setValor(entity.getValor());
        order.setStatus(entity.getStatus());
        order.setDataPedido(entity.getDataPedido());
        if (entity.getCliente() != null) {
            order.setCliente(CustomersMapper.toDomain(entity.getCliente()));
        }
        return order;
    }

    public static OrderEntity toEntity(Pedidos domain) {
        if (domain == null) return null;
        OrderEntity entity = new OrderEntity();
        entity.setId(domain.getId());
        entity.setValor(domain.getValor());
        entity.setStatus(domain.getStatus());
        entity.setDataPedido(domain.getDataPedido());
        if (domain.getCliente() != null) {
            entity.setCliente(CustomersMapper.toEntity(domain.getCliente()));
        }
        return entity;
    }

    public static OrderResponse toResponse(Pedidos domain) {
        if (domain == null) return null;
        return new OrderResponse(
            domain.getId(),
            domain.getValor(),
            domain.getStatus(),
            domain.getDataPedido(),
            domain.getCliente() != null ? domain.getCliente().getId() : null
        );
    }

    public static Pedidos toDomainFromRequest(OrderRequest request) {
        if (request == null) return null;
        Pedidos order = new Pedidos();
        order.setValor(request.valor());
        order.setStatus(request.status());
        order.setDataPedido(request.dataPedido());
        return order;
    }
}