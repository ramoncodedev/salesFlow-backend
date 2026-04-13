package com.sales.flow.SalesFlow.infrastructure.mapper;

import com.sales.flow.SalesFlow.core.entities.users.customers.Customers;
import com.sales.flow.SalesFlow.infrastructure.dtos.CustomersRequest;
import com.sales.flow.SalesFlow.infrastructure.dtos.CustomersResponse;
import com.sales.flow.SalesFlow.infrastructure.persistence.users.CustomersEntity;
import lombok.experimental.UtilityClass;


public class CustomersMapper {

    public static Customers toDomain(CustomersEntity entity) {
        if (entity == null) return null;
        return new Customers(
            entity.getId(),
            entity.getName(),
            entity.getEmail(),
            entity.getTelefone(),
            entity.getEmpresa(),
            entity.getUltimoContato(),
            entity.getCriadoEm()
        );
    }

    public static CustomersEntity toEntity(Customers domain) {
        if (domain == null) return null;
        CustomersEntity entity = new CustomersEntity();
        entity.setId(domain.getId());
        entity.setName(domain.getName());
        entity.setEmail(domain.getEmail());
        entity.setTelefone(domain.getTelefone());
        entity.setEmpresa(domain.getEmpresa());
        entity.setUltimoContato(domain.getUltimoContato());
        entity.setCriadoEm(domain.getCrieadoEm());
        return entity;
    }

    public static CustomersResponse toResponse(Customers domain) {
        if (domain == null) return null;
        return new CustomersResponse(
            domain.getId(),
            domain.getName(),
            domain.getEmail(),
            domain.getTelefone(),
            domain.getEmpresa(),
            domain.getUltimoContato(),
            domain.getCrieadoEm()
        );
    }

    public static Customers toDomainFromRequest(CustomersRequest request) {
        if (request == null) return null;
        return new Customers(
            null,
            request.name(),
            request.email(),
            request.telefone(),
            request.empresa(),
            request.ultimoContato(),
            request.criandoEm()
        );
    }
}