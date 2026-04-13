package com.sales.flow.SalesFlow.infrastructure.dtos;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record GoalResponse(
    Long id,
    String titulo,
    BigDecimal valor,
    LocalDateTime periodoInicio,
    LocalDateTime periodoFim,
    Boolean ativa,
    Long usuarioId,
    BigDecimal progresso
) {}