package com.sales.flow.SalesFlow.core.gateway;

import com.sales.flow.SalesFlow.core.entities.leads.Lead;
import com.sales.flow.SalesFlow.core.entities.leads.LeadStatus;
import java.util.List;
import java.util.Optional;

public interface LeadRepository {

    Lead salvar(Lead lead);
    
    Optional<Lead> buscarPorId(Long id);
    
    List<Lead> buscarTodos();
    
    List<Lead> buscarPorStatus(LeadStatus status);
    
    void deletar(Long id);
    
    Lead atualizar(Lead lead);
}