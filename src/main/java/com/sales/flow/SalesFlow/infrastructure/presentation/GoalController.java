package com.sales.flow.SalesFlow.infrastructure.presentation;

import com.sales.flow.SalesFlow.core.entities.metas.Metas;
import com.sales.flow.SalesFlow.core.gateway.GoalRepository;
import com.sales.flow.SalesFlow.core.usercase.goals.CriarGoalUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/goals")
public class GoalController {

    private final CriarGoalUseCase criarGoalUseCase;
    private final GoalRepository goalRepository;

    public GoalController(CriarGoalUseCase criarGoalUseCase, GoalRepository goalRepository) {
        this.criarGoalUseCase = criarGoalUseCase;
        this.goalRepository = goalRepository;
    }

    @PostMapping
    public ResponseEntity<Metas> criarGoal(@RequestBody Metas goal, @RequestParam Long usuarioId) {
        Metas novaMeta = criarGoalUseCase.executar(goal, usuarioId);
        return ResponseEntity.ok(novaMeta);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Metas>> listarGoalsPorUsuario(@PathVariable Long userId) {
        List<Metas> goals = goalRepository.buscarPorUsuarioId(userId);
        return ResponseEntity.ok(goals);
    }
}