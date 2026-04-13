package com.sales.flow.SalesFlow.infrastructure.mapper;

import com.sales.flow.SalesFlow.core.entities.negotiations.Negotiations;
import com.sales.flow.SalesFlow.infrastructure.dtos.DealRequest;
import com.sales.flow.SalesFlow.infrastructure.dtos.DealResponse;
import com.sales.flow.SalesFlow.infrastructure.persistence.negotiations.NegotiationsEntity;

public class DealMapper {

    public static Negotiations toDomain(NegotiationsEntity entity) {
        if (entity == null) return null;
        Negotiations deal = new Negotiations();
        deal.setId(entity.getId());
        deal.setTitulo(entity.getTitulo());
        deal.setDescricao(entity.getDescricao());
        deal.setValor(entity.getValor());
        deal.setStatus(entity.getStatus());
        deal.setInicio(entity.getInicio());
        deal.setFechamentoEsperado(entity.getFechamentoEsperado());
        if (entity.getCliente() != null) {
            deal.setCliente(CustomersMapper.toDomain(entity.getCliente()));
        }
        return deal;
    }

    public static NegotiationsEntity toEntity(Negotiations domain) {
        if (domain == null) return null;
        NegotiationsEntity entity = new NegotiationsEntity();
        entity.setId(domain.getId());
        entity.setTitulo(domain.getTitulo());
        entity.setDescricao(domain.getDescricao());
        entity.setValor(domain.getValor());
        entity.setStatus(domain.getStatus());
        entity.setInicio(domain.getInicio());
        entity.setFechamentoEsperado(domain.getFechamentoEsperado());
        if (domain.getCliente() != null) {
            entity.setCliente(CustomersMapper.toEntity(domain.getCliente()));
        }
        return entity;
    }

    public static DealResponse toResponse(Negotiations domain) {
        if (domain == null) return null;
        return new DealResponse(
            domain.getId(),
            domain.getTitulo(),
            domain.getDescricao(),
            domain.getValor(),
            domain.getStatus(),
            domain.getInicio(),
            domain.getFechamentoEsperado(),
            domain.getCliente() != null ? domain.getCliente().getId() : null
        );
    }

    public static Negotiations toDomainFromRequest(DealRequest request) {
        if (request == null) return null;
        Negotiations deal = new Negotiations();
        deal.setTitulo(request.titulo());
        deal.setDescricao(request.descricao());
        deal.setValor(request.valor());
        deal.setStatus(request.status());
        deal.setInicio(request.inicio());
        deal.setFechamentoEsperado(request.fechamentoEsperado());
        return deal;
    }
}