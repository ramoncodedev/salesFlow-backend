package com.sales.flow.SalesFlow.core.usercase.goals;

import com.sales.flow.SalesFlow.core.entities.metas.Metas;
import com.sales.flow.SalesFlow.core.gateway.GoalRepository;
import java.math.BigDecimal;
import java.util.Optional;

public class AtualizarProgressoGoalUseCaseImp implements AtualizarProgressoGoalUseCase {

    private final GoalRepository goalRepository;

    public AtualizarProgressoGoalUseCaseImp(GoalRepository goalRepository) {
        this.goalRepository = goalRepository;
    }

    @Override
    public Metas executar(Long goalId, BigDecimal valorVendido) {
        Optional<Metas> goalOpt = goalRepository.buscarPorId(goalId);
        if (goalOpt.isEmpty()) {
            throw new RuntimeException("Goal não encontrado com ID: " + goalId);
        }
        
        Metas goal = goalOpt.get();
        BigDecimal novoProgresso = goal.getProgresso().add(valorVendido);
        goal.setProgresso(novoProgresso);
        
        return goalRepository.atualizar(goal);
    }
}