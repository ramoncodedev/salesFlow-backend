package com.sales.flow.SalesFlow.infrastructure.presentation;

import com.sales.flow.SalesFlow.core.entities.pedidos.Pedidos;
import com.sales.flow.SalesFlow.core.entities.pedidos.PedidosStatus;
import com.sales.flow.SalesFlow.core.usercase.orders.AtualizarStatusOrderUseCase;
import com.sales.flow.SalesFlow.core.usercase.orders.CriarOrderUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final CriarOrderUseCase criarOrderUseCase;
    private final AtualizarStatusOrderUseCase atualizarStatusOrderUseCase;

    public OrderController(CriarOrderUseCase criarOrderUseCase,
                          AtualizarStatusOrderUseCase atualizarStatusOrderUseCase) {
        this.criarOrderUseCase = criarOrderUseCase;
        this.atualizarStatusOrderUseCase = atualizarStatusOrderUseCase;
    }

    @PostMapping
    public ResponseEntity<Pedidos> criarOrder(@RequestBody Pedidos order) {
        Pedidos novoOrder = criarOrderUseCase.executar(order);
        return ResponseEntity.ok(novoOrder);
    }

    @GetMapping
    public ResponseEntity<List<Pedidos>> listarOrders() {
        return ResponseEntity.ok(List.of());
    }

    @PatchMapping("/{id}/status")
    public ResponseEntity<Pedidos> atualizarStatus(@PathVariable Long id, @RequestBody PedidosStatus status) {
        Pedidos order = atualizarStatusOrderUseCase.executar(id, status);
        return ResponseEntity.ok(order);
    }
}