package com.sales.flow.SalesFlow.infrastructure.dtos;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

public record CustomersRequest(

        @NotBlank(message = "O nome do cliente é obrigatório")
        String name,
        String email,
        String telefone,
        String empresa,
        LocalDateTime ultimoContato,
        LocalDateTime criandoEm
) {
}
