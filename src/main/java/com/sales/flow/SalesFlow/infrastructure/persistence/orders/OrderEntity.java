package com.sales.flow.SalesFlow.infrastructure.persistence.orders;

import com.sales.flow.SalesFlow.core.entities.pedidos.PedidosStatus;
import com.sales.flow.SalesFlow.infrastructure.persistence.users.CustomersEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(precision = 10, scale = 2)
    private BigDecimal valor;

    @Enumerated(EnumType.STRING)
    @Column(length = 50, nullable = false)
    private PedidosStatus status;

    @Column(name = "data_pedido")
    private LocalDateTime dataPedido;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id")
    private CustomersEntity cliente;
}