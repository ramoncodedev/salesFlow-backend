package com.sales.flow.SalesFlow.infrastructure.dtos;

import com.sales.flow.SalesFlow.core.entities.cotacoes.CotacoesStatus;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public record QuoteRequest(
    String descricao,
    BigDecimal valor,
    CotacoesStatus status,
    LocalDateTime validade,
    Long clienteId
) {}