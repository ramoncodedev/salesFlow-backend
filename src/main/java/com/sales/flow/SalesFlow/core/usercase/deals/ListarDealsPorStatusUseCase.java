package com.sales.flow.SalesFlow.core.usercase.deals;

import com.sales.flow.SalesFlow.core.entities.negotiations.NegotiationStatus;
import java.util.List;
import com.sales.flow.SalesFlow.core.entities.negotiations.Negotiations;

public interface ListarDealsPorStatusUseCase {
    List<Negotiations> executar(NegotiationStatus status);
}