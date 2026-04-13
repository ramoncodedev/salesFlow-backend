package com.sales.flow.SalesFlow.infrastructure.persistence.goals;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoalRepository extends JpaRepository<GoalEntity, Long> {
    List<GoalEntity> findByUsuarioId(Long usuarioId);
}