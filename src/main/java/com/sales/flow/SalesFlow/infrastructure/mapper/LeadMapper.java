package com.sales.flow.SalesFlow.infrastructure.mapper;

import com.sales.flow.SalesFlow.core.entities.leads.Lead;
import com.sales.flow.SalesFlow.infrastructure.dtos.LeadRequest;
import com.sales.flow.SalesFlow.infrastructure.dtos.LeadResponse;
import com.sales.flow.SalesFlow.infrastructure.persistence.leads.LeadEntity;

public class LeadMapper {

    public static Lead toDomain(LeadEntity entity) {
        if (entity == null) return null;
        Lead lead = new Lead();
        lead.setId(entity.getId());
        lead.setNome(entity.getNome());
        lead.setEmail(entity.getEmail());
        lead.setTelefone(entity.getTelefone());
        lead.setEmpresa(entity.getEmpresa());
        lead.setStatus(entity.getStatus());
        lead.setCriadoEm(entity.getCriadoEm());
        if (entity.getCustomer() != null) {
            lead.setCustomer(CustomersMapper.toDomain(entity.getCustomer()));
        }
        return lead;
    }

    public static LeadEntity toEntity(Lead domain) {
        if (domain == null) return null;
        LeadEntity entity = new LeadEntity();
        entity.setId(domain.getId());
        entity.setNome(domain.getNome());
        entity.setEmail(domain.getEmail());
        entity.setTelefone(domain.getTelefone());
        entity.setEmpresa(domain.getEmpresa());
        entity.setStatus(domain.getStatus());
        entity.setCriadoEm(domain.getCriadoEm());
        if (domain.getCustomer() != null) {
            entity.setCustomer(CustomersMapper.toEntity(domain.getCustomer()));
        }
        return entity;
    }

    public static LeadResponse toResponse(Lead domain) {
        if (domain == null) return null;
        return new LeadResponse(
            domain.getId(),
            domain.getNome(),
            domain.getEmail(),
            domain.getTelefone(),
            domain.getEmpresa(),
            domain.getStatus(),
            domain.getCriadoEm(),
            domain.getCustomer() != null ? domain.getCustomer().getId() : null
        );
    }

    public static Lead toDomainFromRequest(LeadRequest request) {
        if (request == null) return null;
        Lead lead = new Lead();
        lead.setNome(request.nome());
        lead.setEmail(request.email());
        lead.setTelefone(request.telefone());
        lead.setEmpresa(request.empresa());
        lead.setStatus(request.status());
        return lead;
    }
}