package com.sales.flow.SalesFlow.core.usercase.quotes;

import com.sales.flow.SalesFlow.core.entities.cotacoes.Cotacoes;
import com.sales.flow.SalesFlow.core.entities.cotacoes.CotacoesStatus;

public interface AtualizarStatusQuoteUseCase {
    Cotacoes executar(Long id, CotacoesStatus status);
}