package com.sales.flow.SalesFlow.infrastructure.persistence.negotiations;

import com.sales.flow.SalesFlow.core.entities.negotiations.NegotiationStatus;
import com.sales.flow.SalesFlow.infrastructure.persistence.users.CustomersEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "negotiations")
public class NegotiationsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 260, nullable = false)
    private String titulo;

    @Column(columnDefinition = "TEXT")
    private String descricao;

    @Column(precision = 10, scale = 2)
    private BigDecimal valor;

    @Enumerated(EnumType.STRING)
    @Column(length = 50, nullable = false)
    private NegotiationStatus status;

    @CreationTimestamp
    private LocalDateTime inicio;

    @Column(name = "fechamento_esperado")
    private LocalDateTime fechamentoEsperado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id")
    private CustomersEntity cliente;
}