package com.sales.flow.SalesFlow.core.usercase.quotes;

import com.sales.flow.SalesFlow.core.entities.cotacoes.Cotacoes;
import com.sales.flow.SalesFlow.core.entities.cotacoes.CotacoesStatus;
import com.sales.flow.SalesFlow.core.gateway.QuoteRepository;
import java.util.Optional;

public class AtualizarStatusQuoteUseCaseImp implements AtualizarStatusQuoteUseCase {

    private final QuoteRepository quoteRepository;

    public AtualizarStatusQuoteUseCaseImp(QuoteRepository quoteRepository) {
        this.quoteRepository = quoteRepository;
    }

    @Override
    public Cotacoes executar(Long id, CotacoesStatus status) {
        Optional<Cotacoes> quoteOpt = quoteRepository.buscarPorId(id);
        if (quoteOpt.isEmpty()) {
            throw new RuntimeException("Quote não encontrado com ID: " + id);
        }
        Cotacoes quote = quoteOpt.get();
        quote.setStatus(status);
        return quoteRepository.atualizar(quote);
    }
}