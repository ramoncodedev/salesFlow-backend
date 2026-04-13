package com.sales.flow.SalesFlow.core.usercase.goals;

import com.sales.flow.SalesFlow.core.entities.metas.Metas;
import com.sales.flow.SalesFlow.core.gateway.GoalRepository;

public class CriarGoalUseCaseImp implements CriarGoalUseCase {

    private final GoalRepository goalRepository;

    public CriarGoalUseCaseImp(GoalRepository goalRepository) {
        this.goalRepository = goalRepository;
    }

    @Override
    public Metas executar(Metas goal, Long usuarioId) {
        goal.setUsuarioId(usuarioId);
        goal.setProgresso(java.math.BigDecimal.ZERO);
        goal.setAtiva(true);
        return goalRepository.salvar(goal);
    }
}