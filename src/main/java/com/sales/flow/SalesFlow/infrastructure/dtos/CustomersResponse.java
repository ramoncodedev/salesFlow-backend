package com.sales.flow.SalesFlow.infrastructure.dtos;

import lombok.Builder;

import java.time.LocalDateTime;

public record CustomersResponse(
    Long id,
    String name,
    String email,
    String telefone,
    String empresa,
    LocalDateTime ultimoContato,
    LocalDateTime crieadoEm
) {}