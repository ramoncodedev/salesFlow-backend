package com.sales.flow.SalesFlow.core.entities.users.customers;

import java.time.LocalDateTime;

public class Customers {

    Long id;
    private String name;
    private String email;
    private String telefone;
    private String empresa;
    private LocalDateTime ultimoContato;
    private LocalDateTime crieadoEm;

    public Customers() {
    }

    public Customers(Long id, String name, String email, String telefone, String empresa, LocalDateTime ultimoContato, LocalDateTime crieadoEm) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.telefone = telefone;
        this.empresa = empresa;
        this.ultimoContato = ultimoContato;
        this.crieadoEm = crieadoEm;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public LocalDateTime getUltimoContato() {
        return ultimoContato;
    }

    public void setUltimoContato(LocalDateTime ultimoContato) {
        this.ultimoContato = ultimoContato;
    }

    public LocalDateTime getCrieadoEm() {
        return crieadoEm;
    }

    public void setCrieadoEm(LocalDateTime crieadoEm) {
        this.crieadoEm = crieadoEm;
    }
}