package com.sales.flow.SalesFlow.core.usercase.quotes;

import com.sales.flow.SalesFlow.core.entities.cotacoes.Cotacoes;
import com.sales.flow.SalesFlow.core.gateway.QuoteRepository;

public class CriarQuoteUseCaseImp implements CriarQuoteUseCase {

    private final QuoteRepository quoteRepository;

    public CriarQuoteUseCaseImp(QuoteRepository quoteRepository) {
        this.quoteRepository = quoteRepository;
    }

    @Override
    public Cotacoes executar(Cotacoes quote) {
        return quoteRepository.salvar(quote);
    }
}