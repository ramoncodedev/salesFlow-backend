package com.sales.flow.SalesFlow.infrastructure.mapper;

import com.sales.flow.SalesFlow.core.entities.metas.Metas;
import com.sales.flow.SalesFlow.infrastructure.dtos.GoalRequest;
import com.sales.flow.SalesFlow.infrastructure.dtos.GoalResponse;
import com.sales.flow.SalesFlow.infrastructure.persistence.goals.GoalEntity;

public class GoalMapper {

    public static Metas toDomain(GoalEntity entity) {
        if (entity == null) return null;
        Metas goal = new Metas();
        goal.setId(entity.getId());
        goal.setTitulo(entity.getTitulo());
        goal.setValor(entity.getValor());
        goal.setPeriodoInicio(entity.getPeriodoInicio());
        goal.setPeriodoFim(entity.getPeriodoFim());
        goal.setAtiva(entity.getAtiva());
        goal.setUsuarioId(entity.getUsuarioId());
        goal.setProgresso(entity.getProgresso());
        return goal;
    }

    public static GoalEntity toEntity(Metas domain) {
        if (domain == null) return null;
        GoalEntity entity = new GoalEntity();
        entity.setId(domain.getId());
        entity.setTitulo(domain.getTitulo());
        entity.setValor(domain.getValor());
        entity.setPeriodoInicio(domain.getPeriodoInicio());
        entity.setPeriodoFim(domain.getPeriodoFim());
        entity.setAtiva(domain.getAtiva());
        entity.setUsuarioId(domain.getUsuarioId());
        entity.setProgresso(domain.getProgresso());
        return entity;
    }

    public static GoalResponse toResponse(Metas domain) {
        if (domain == null) return null;
        return new GoalResponse(
            domain.getId(),
            domain.getTitulo(),
            domain.getValor(),
            domain.getPeriodoInicio(),
            domain.getPeriodoFim(),
            domain.getAtiva(),
            domain.getUsuarioId(),
            domain.getProgresso()
        );
    }

    public static Metas toDomainFromRequest(GoalRequest request) {
        if (request == null) return null;
        Metas goal = new Metas();
        goal.setTitulo(request.titulo());
        goal.setValor(request.valor());
        goal.setPeriodoInicio(request.periodoInicio());
        goal.setPeriodoFim(request.periodoFim());
        goal.setAtiva(request.ativa());
        goal.setUsuarioId(request.usuarioId());
        return goal;
    }
}