package com.sales.flow.SalesFlow.core.usercase.goals;

import com.sales.flow.SalesFlow.core.entities.metas.Metas;

public interface CriarGoalUseCase {
    Metas executar(Metas goal, Long usuarioId);
}