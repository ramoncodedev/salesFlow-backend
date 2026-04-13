package com.sales.flow.SalesFlow.infrastructure.persistence.quotes;

import com.sales.flow.SalesFlow.core.entities.cotacoes.CotacoesStatus;
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
@Table(name = "quotes")
public class QuoteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String descricao;

    @Column(precision = 10, scale = 2)
    private BigDecimal valor;

    @Enumerated(EnumType.STRING)
    @Column(length = 50, nullable = false)
    private CotacoesStatus status;

    private LocalDateTime validade;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id")
    private CustomersEntity cliente;
}