package com.sales.flow.SalesFlow.core.usercase.deals;

import com.sales.flow.SalesFlow.core.entities.negotiations.Negotiations;
import com.sales.flow.SalesFlow.core.entities.negotiations.NegotiationStatus;
import com.sales.flow.SalesFlow.core.gateway.DealRepository;
import java.util.Optional;

public class MoverStageDealUseCaseImp implements MoverStageDealUseCase {

    private final DealRepository dealRepository;

    public MoverStageDealUseCaseImp(DealRepository dealRepository) {
        this.dealRepository = dealRepository;
    }

    @Override
    public Negotiations executar(Long id, NegotiationStatus status) {
        Optional<Negotiations> dealOpt = dealRepository.buscarPorId(id);
        if (dealOpt.isEmpty()) {
            throw new RuntimeException("Deal não encontrado com ID: " + id);
        }
        Negotiations deal = dealOpt.get();
        deal.setStatus(status);
        return dealRepository.atualizar(deal);
    }
}