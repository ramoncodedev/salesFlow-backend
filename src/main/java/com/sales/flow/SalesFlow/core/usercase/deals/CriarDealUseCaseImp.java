package com.sales.flow.SalesFlow.core.usercase.deals;

import com.sales.flow.SalesFlow.core.entities.negotiations.Negotiations;
import com.sales.flow.SalesFlow.core.gateway.DealRepository;
import java.time.LocalDateTime;

public class CriarDealUseCaseImp implements CriarDealUseCase {

    private final DealRepository dealRepository;

    public CriarDealUseCaseImp(DealRepository dealRepository) {
        this.dealRepository = dealRepository;
    }

    @Override
    public Negotiations executar(Negotiations deal) {
        deal.setInicio(LocalDateTime.now());
        return dealRepository.salvar(deal);
    }
}