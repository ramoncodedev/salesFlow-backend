package com.sales.flow.SalesFlow.infrastructure.dtos;

import com.sales.flow.SalesFlow.core.entities.negotiations.NegotiationStatus;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public record DealRequest(
    String titulo,
    String descricao,
    BigDecimal valor,
    NegotiationStatus status,
    LocalDateTime inicio,
    LocalDateTime fechamentoEsperado,
    Long clienteId
) {}