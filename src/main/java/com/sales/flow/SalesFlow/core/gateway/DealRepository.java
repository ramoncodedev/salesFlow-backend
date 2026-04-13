package com.sales.flow.SalesFlow.core.gateway;

import com.sales.flow.SalesFlow.core.entities.negotiations.Negotiations;
import com.sales.flow.SalesFlow.core.entities.negotiations.NegotiationStatus;
import java.util.List;
import java.util.Optional;

public interface DealRepository {

    Negotiations salvar(Negotiations deal);
    
    Optional<Negotiations> buscarPorId(Long id);
    
    List<Negotiations> buscarTodos();
    
    List<Negotiations> buscarPorStatus(NegotiationStatus status);
    
    void deletar(Long id);
    
    Negotiations atualizar(Negotiations deal);
}