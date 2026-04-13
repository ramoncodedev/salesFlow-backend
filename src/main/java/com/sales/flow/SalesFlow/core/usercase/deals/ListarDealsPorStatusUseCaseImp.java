package com.sales.flow.SalesFlow.core.usercase.deals;

import com.sales.flow.SalesFlow.core.entities.negotiations.NegotiationStatus;
import com.sales.flow.SalesFlow.core.entities.negotiations.Negotiations;
import com.sales.flow.SalesFlow.core.gateway.DealRepository;
import java.util.List;

public class ListarDealsPorStatusUseCaseImp implements ListarDealsPorStatusUseCase {

    private final DealRepository dealRepository;

    public ListarDealsPorStatusUseCaseImp(DealRepository dealRepository) {
        this.dealRepository = dealRepository;
    }

    @Override
    public List<Negotiations> executar(NegotiationStatus status) {
        return dealRepository.buscarPorStatus(status);
    }
}