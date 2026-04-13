package com.sales.flow.SalesFlow.core.usercase.leads;

import com.sales.flow.SalesFlow.core.entities.leads.Lead;
import com.sales.flow.SalesFlow.core.gateway.LeadRepository;
import java.time.LocalDateTime;

public class CriarLeadUseCaseImp implements CriarLeadUseCase {

    private final LeadRepository leadRepository;

    public CriarLeadUseCaseImp(LeadRepository leadRepository) {
        this.leadRepository = leadRepository;
    }

    @Override
    public Lead executar(Lead lead) {
        lead.setStatus(com.sales.flow.SalesFlow.core.entities.leads.LeadStatus.NOVO);
        lead.setCriadoEm(LocalDateTime.now());
        return leadRepository.salvar(lead);
    }
}