package com.sales.flow.SalesFlow.core.gateway;

import com.sales.flow.SalesFlow.core.entities.metas.Metas;
import java.util.List;
import java.util.Optional;

public interface GoalRepository {

    Metas salvar(Metas goal);
    
    Optional<Metas> buscarPorId(Long id);
    
    List<Metas> buscarTodos();
    
    List<Metas> buscarPorUsuarioId(Long usuarioId);
    
    void deletar(Long id);
    
    Metas atualizar(Metas goal);
}