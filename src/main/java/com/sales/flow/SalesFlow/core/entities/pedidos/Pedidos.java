package com.sales.flow.SalesFlow.core.entities.pedidos;

import com.sales.flow.SalesFlow.core.entities.users.customers.Customers;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Pedidos {

   private Long id;
   private BigDecimal valor;
    private PedidosStatus status;
   private LocalDateTime dataPedido;
   private Customers cliente;

   public Pedidos() {
   }

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public BigDecimal getValor() {
      return valor;
   }

   public void setValor(BigDecimal valor) {
      this.valor = valor;
   }

    public PedidosStatus getStatus() {
       return status;
    }

    public void setStatus(PedidosStatus status) {
       this.status = status;
    }

   public LocalDateTime getDataPedido() {
      return dataPedido;
   }

   public void setDataPedido(LocalDateTime dataPedido) {
      this.dataPedido = dataPedido;
   }

   public Customers getCliente() {
      return cliente;
   }

   public void setCliente(Customers cliente) {
      this.cliente = cliente;
   }
}