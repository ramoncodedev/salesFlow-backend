package com.sales.flow.SalesFlow.core.usercase.leads;

import com.sales.flow.SalesFlow.core.entities.leads.Lead;
import com.sales.flow.SalesFlow.core.entities.leads.LeadStatus;
import com.sales.flow.SalesFlow.core.gateway.LeadRepository;
import java.util.Optional;

public class AtualizarStatusLeadUseCaseImp implements AtualizarStatusLeadUseCase {

    private final LeadRepository leadRepository;

    public AtualizarStatusLeadUseCaseImp(LeadRepository leadRepository) {
        this.leadRepository = leadRepository;
    }

    @Override
    public Lead executar(Long id, LeadStatus status) {
        Optional<Lead> leadOpt = leadRepository.buscarPorId(id);
        if (leadOpt.isEmpty()) {
            throw new RuntimeException("Lead não encontrado com ID: " + id);
        }
        Lead lead = leadOpt.get();
        lead.setStatus(status);
        return leadRepository.atualizar(lead);
    }
}