package com.sales.flow.SalesFlow.core.usercase.goals;

import com.sales.flow.SalesFlow.core.entities.metas.Metas;
import java.math.BigDecimal;
import java.util.List;

public interface AtualizarProgressoGoalUseCase {
    Metas executar(Long goalId, BigDecimal valorVendido);
}