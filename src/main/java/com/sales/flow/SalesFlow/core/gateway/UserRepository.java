package com.sales.flow.SalesFlow.core.gateway;

import com.sales.flow.SalesFlow.core.entities.users.sellers.User;
import java.util.List;
import java.util.Optional;

public interface UserRepository {

    User salvar(User user);
    
    Optional<User> buscarPorId(Long id);
    
    Optional<User> buscarPorEmail(String email);
    
    List<User> buscarTodos();
    
    void deletar(Long id);
}