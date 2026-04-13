package com.sales.flow.SalesFlow.core.usercase.deals;

import com.sales.flow.SalesFlow.core.entities.negotiations.Negotiations;
import com.sales.flow.SalesFlow.core.entities.negotiations.NegotiationStatus;

public interface MoverStageDealUseCase {
    Negotiations executar(Long id, NegotiationStatus status);
}