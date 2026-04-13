package com.sales.flow.SalesFlow.core.usercase.quotes;

import com.sales.flow.SalesFlow.core.entities.cotacoes.Cotacoes;

public interface CriarQuoteUseCase {
    Cotacoes executar(Cotacoes quote);
}