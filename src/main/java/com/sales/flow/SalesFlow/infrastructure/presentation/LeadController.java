package com.sales.flow.SalesFlow.infrastructure.presentation;

import com.sales.flow.SalesFlow.core.entities.leads.Lead;
import com.sales.flow.SalesFlow.core.entities.leads.LeadStatus;
import com.sales.flow.SalesFlow.core.usercase.leads.AtualizarStatusLeadUseCase;
import com.sales.flow.SalesFlow.core.usercase.leads.ConverterLeadUseCase;
import com.sales.flow.SalesFlow.core.usercase.leads.CriarLeadUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/leads")
public class LeadController {

    private final CriarLeadUseCase criarLeadUseCase;
    private final AtualizarStatusLeadUseCase atualizarStatusLeadUseCase;
    private final ConverterLeadUseCase converterLeadUseCase;

    public LeadController(CriarLeadUseCase criarLeadUseCase,
                         AtualizarStatusLeadUseCase atualizarStatusLeadUseCase,
                         ConverterLeadUseCase converterLeadUseCase) {
        this.criarLeadUseCase = criarLeadUseCase;
        this.atualizarStatusLeadUseCase = atualizarStatusLeadUseCase;
        this.converterLeadUseCase = converterLeadUseCase;
    }

    @PostMapping
    public ResponseEntity<Lead> criarLead(@RequestBody Lead lead) {
        Lead novoLead = criarLeadUseCase.executar(lead);
        return ResponseEntity.ok(novoLead);
    }

    @GetMapping
    public ResponseEntity<List<Lead>> listarLeads() {
        return ResponseEntity.ok(List.of());
    }

    @PatchMapping("/{id}/status")
    public ResponseEntity<Lead> atualizarStatus(@PathVariable Long id, @RequestBody LeadStatus status) {
        Lead lead = atualizarStatusLeadUseCase.executar(id, status);
        return ResponseEntity.ok(lead);
    }

    @PostMapping("/{id}/convert")
    public ResponseEntity<?> converterLead(@PathVariable Long id) {
        converterLeadUseCase.executar(id);
        return ResponseEntity.ok().build();
    }
}