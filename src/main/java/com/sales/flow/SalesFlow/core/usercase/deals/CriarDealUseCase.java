package com.sales.flow.SalesFlow.core.usercase.deals;

import com.sales.flow.SalesFlow.core.entities.negotiations.Negotiations;

public interface CriarDealUseCase {
    Negotiations executar(Negotiations deal);
}