package com.sales.flow.SalesFlow.infrastructure.presentation;

import com.sales.flow.SalesFlow.core.entities.cotacoes.Cotacoes;
import com.sales.flow.SalesFlow.core.entities.cotacoes.CotacoesStatus;
import com.sales.flow.SalesFlow.core.usercase.quotes.AtualizarStatusQuoteUseCase;
import com.sales.flow.SalesFlow.core.usercase.quotes.CriarQuoteUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quotes")
public class QuoteController {

    private final CriarQuoteUseCase criarQuoteUseCase;
    private final AtualizarStatusQuoteUseCase atualizarStatusQuoteUseCase;

    public QuoteController(CriarQuoteUseCase criarQuoteUseCase,
                          AtualizarStatusQuoteUseCase atualizarStatusQuoteUseCase) {
        this.criarQuoteUseCase = criarQuoteUseCase;
        this.atualizarStatusQuoteUseCase = atualizarStatusQuoteUseCase;
    }

    @PostMapping
    public ResponseEntity<Cotacoes> criarQuote(@RequestBody Cotacoes quote) {
        Cotacoes novoQuote = criarQuoteUseCase.executar(quote);
        return ResponseEntity.ok(novoQuote);
    }

    @GetMapping
    public ResponseEntity<List<Cotacoes>> listarQuotes() {
        return ResponseEntity.ok(List.of());
    }

    @PatchMapping("/{id}/status")
    public ResponseEntity<Cotacoes> atualizarStatus(@PathVariable Long id, @RequestBody CotacoesStatus status) {
        Cotacoes quote = atualizarStatusQuoteUseCase.executar(id, status);
        return ResponseEntity.ok(quote);
    }
}