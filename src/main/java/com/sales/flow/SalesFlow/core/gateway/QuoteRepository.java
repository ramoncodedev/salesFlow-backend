package com.sales.flow.SalesFlow.core.gateway;

import com.sales.flow.SalesFlow.core.entities.cotacoes.Cotacoes;
import com.sales.flow.SalesFlow.core.entities.cotacoes.CotacoesStatus;
import java.util.List;
import java.util.Optional;

public interface QuoteRepository {

    Cotacoes salvar(Cotacoes quote);
    
    Optional<Cotacoes> buscarPorId(Long id);
    
    List<Cotacoes> buscarTodos();
    
    List<Cotacoes> buscarPorStatus(CotacoesStatus status);
    
    void deletar(Long id);
    
    Cotacoes atualizar(Cotacoes quote);
}