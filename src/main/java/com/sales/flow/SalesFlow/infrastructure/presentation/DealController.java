package com.sales.flow.SalesFlow.infrastructure.presentation;

import com.sales.flow.SalesFlow.core.entities.negotiations.Negotiations;
import com.sales.flow.SalesFlow.core.entities.negotiations.NegotiationStatus;
import com.sales.flow.SalesFlow.core.usercase.deals.CriarDealUseCase;
import com.sales.flow.SalesFlow.core.usercase.deals.ListarDealsPorStatusUseCase;
import com.sales.flow.SalesFlow.core.usercase.deals.MoverStageDealUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/deals")
public class DealController {

    private final CriarDealUseCase criarDealUseCase;
    private final MoverStageDealUseCase moverStageDealUseCase;
    private final ListarDealsPorStatusUseCase listarDealsPorStatusUseCase;

    public DealController(CriarDealUseCase criarDealUseCase,
                          MoverStageDealUseCase moverStageDealUseCase,
                          ListarDealsPorStatusUseCase listarDealsPorStatusUseCase) {
        this.criarDealUseCase = criarDealUseCase;
        this.moverStageDealUseCase = moverStageDealUseCase;
        this.listarDealsPorStatusUseCase = listarDealsPorStatusUseCase;
    }

    @PostMapping
    public ResponseEntity<Negotiations> criarDeal(@RequestBody Negotiations deal) {
        Negotiations novoDeal = criarDealUseCase.executar(deal);
        return ResponseEntity.ok(novoDeal);
    }

    @GetMapping
    public ResponseEntity<List<Negotiations>> listarDeals(@RequestParam(required = false) NegotiationStatus status) {
        if (status != null) {
            List<Negotiations> deals = listarDealsPorStatusUseCase.executar(status);
            return ResponseEntity.ok(deals);
        }
        return ResponseEntity.ok(List.of());
    }

    @PatchMapping("/{id}/status")
    public ResponseEntity<Negotiations> atualizarStatus(@PathVariable Long id, @RequestBody NegotiationStatus status) {
        Negotiations deal = moverStageDealUseCase.executar(id, status);
        return ResponseEntity.ok(deal);
    }
}