package com.sales.flow.SalesFlow.core.entities.negotiations;

import com.sales.flow.SalesFlow.core.entities.users.customers.Customers;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Negotiations {

    Long id;
    private String titulo;
    private String descricao;
    private BigDecimal valor;
    private NegotiationStatus status;
    private LocalDateTime inicio;
    private LocalDateTime fechamentoEsperado;
    private Customers cliente;

    public Negotiations() {
    }

    public Negotiations(Long id, String titulo, String descricao, BigDecimal valor, NegotiationStatus status, LocalDateTime inicio, LocalDateTime fechamentoEsperado, Customers cliente) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.valor = valor;
        this.status = status;
        this.inicio = inicio;
        this.fechamentoEsperado = fechamentoEsperado;
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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

    public NegotiationStatus getStatus() {
        return status;
    }

    public void setStatus(NegotiationStatus status) {
        this.status = status;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

    public LocalDateTime getFechamentoEsperado() {
        return fechamentoEsperado;
    }

    public void setFechamentoEsperado(LocalDateTime fechamentoEsperado) {
        this.fechamentoEsperado = fechamentoEsperado;
    }

    public Customers getCliente() {
        return cliente;
    }

    public void setCliente(Customers cliente) {
        this.cliente = cliente;
    }
}