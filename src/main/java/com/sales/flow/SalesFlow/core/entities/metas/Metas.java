package com.sales.flow.SalesFlow.core.entities.metas;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Metas {

    Long id;
    private String titulo;
    private BigDecimal valor;
    private LocalDateTime periodoInicio;
    private LocalDateTime periodoFim;
    private Boolean ativa;
    private Long usuarioId;
    private BigDecimal progresso;

    public Metas() {
    }

    public Metas(Long id, String titulo, BigDecimal valor, LocalDateTime periodoInicio, LocalDateTime periodoFim, Boolean ativa) {
        this.id = id;
        this.titulo = titulo;
        this.valor = valor;
        this.periodoInicio = periodoInicio;
        this.periodoFim = periodoFim;
        this.ativa = ativa;
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

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public LocalDateTime getPeriodoInicio() {
        return periodoInicio;
    }

    public void setPeriodoInicio(LocalDateTime periodoInicio) {
        this.periodoInicio = periodoInicio;
    }

    public LocalDateTime getPeriodoFim() {
        return periodoFim;
    }

    public void setPeriodoFim(LocalDateTime periodoFim) {
        this.periodoFim = periodoFim;
    }

    public Boolean getAtiva() {
        return ativa;
    }

    public void setAtiva(Boolean ativa) {
        this.ativa = ativa;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public BigDecimal getProgresso() {
        return progresso;
    }

    public void setProgresso(BigDecimal progresso) {
        this.progresso = progresso;
    }
}