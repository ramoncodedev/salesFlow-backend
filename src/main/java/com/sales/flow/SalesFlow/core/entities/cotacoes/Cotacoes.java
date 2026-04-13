package com.sales.flow.SalesFlow.core.entities.cotacoes;

import com.sales.flow.SalesFlow.core.entities.users.customers.Customers;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Cotacoes {

    Long id;
    private String descricao;
    private BigDecimal valor;
    private CotacoesStatus status;
    private LocalDateTime validade;
    private Customers cliente;

    public Cotacoes() {
    }

    public Cotacoes(Long id, String descricao, BigDecimal valor, CotacoesStatus status, LocalDateTime validade, Customers cliente) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.status = status;
        this.validade = validade;
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public CotacoesStatus getStatus() {
        return status;
    }

    public void setStatus(CotacoesStatus status) {
        this.status = status;
    }

    public LocalDateTime getValidade() {
        return validade;
    }

    public void setValidade(LocalDateTime validade) {
        this.validade = validade;
    }

    public Customers getCliente() {
        return cliente;
    }

    public void setCliente(Customers cliente) {
        this.cliente = cliente;
    }
}