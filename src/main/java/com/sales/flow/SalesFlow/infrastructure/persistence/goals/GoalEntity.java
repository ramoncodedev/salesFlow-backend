package com.sales.flow.SalesFlow.infrastructure.persistence.goals;

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
@Table(name = "goals")
public class GoalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 260, nullable = false)
    private String titulo;

    @Column(precision = 10, scale = 2)
    private BigDecimal valor;

    @Column(name = "periodo_inicio")
    private LocalDateTime periodoInicio;

    @Column(name = "periodo_fim")
    private LocalDateTime periodoFim;

    private Boolean ativa;

    @Column(name = "usuario_id")
    private Long usuarioId;

    @Column(precision = 5, scale = 2)
    private BigDecimal progresso;
}