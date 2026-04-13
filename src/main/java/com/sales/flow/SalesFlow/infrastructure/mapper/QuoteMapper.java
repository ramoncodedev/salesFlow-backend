package com.sales.flow.SalesFlow.infrastructure.mapper;

import com.sales.flow.SalesFlow.core.entities.cotacoes.Cotacoes;
import com.sales.flow.SalesFlow.infrastructure.dtos.QuoteRequest;
import com.sales.flow.SalesFlow.infrastructure.dtos.QuoteResponse;
import com.sales.flow.SalesFlow.infrastructure.persistence.quotes.QuoteEntity;

public class QuoteMapper {

    public static Cotacoes toDomain(QuoteEntity entity) {
        if (entity == null) return null;
        Cotacoes quote = new Cotacoes();
        quote.setId(entity.getId());
        quote.setDescricao(entity.getDescricao());
        quote.setValor(entity.getValor());
        quote.setStatus(entity.getStatus());
        quote.setValidade(entity.getValidade());
        if (entity.getCliente() != null) {
            quote.setCliente(CustomersMapper.toDomain(entity.getCliente()));
        }
        return quote;
    }

    public static QuoteEntity toEntity(Cotacoes domain) {
        if (domain == null) return null;
        QuoteEntity entity = new QuoteEntity();
        entity.setId(domain.getId());
        entity.setDescricao(domain.getDescricao());
        entity.setValor(domain.getValor());
        entity.setStatus(domain.getStatus());
        entity.setValidade(domain.getValidade());
        if (domain.getCliente() != null) {
            entity.setCliente(CustomersMapper.toEntity(domain.getCliente()));
        }
        return entity;
    }

    public static QuoteResponse toResponse(Cotacoes domain) {
        if (domain == null) return null;
        return new QuoteResponse(
            domain.getId(),
            domain.getDescricao(),
            domain.getValor(),
            domain.getStatus(),
            domain.getValidade(),
            domain.getCliente() != null ? domain.getCliente().getId() : null
        );
    }

    public static Cotacoes toDomainFromRequest(QuoteRequest request) {
        if (request == null) return null;
        Cotacoes quote = new Cotacoes();
        quote.setDescricao(request.descricao());
        quote.setValor(request.valor());
        quote.setStatus(request.status());
        quote.setValidade(request.validade());
        return quote;
    }
}