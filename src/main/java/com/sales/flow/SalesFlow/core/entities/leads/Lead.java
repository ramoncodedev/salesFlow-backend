package com.sales.flow.SalesFlow.core.entities.leads;

import com.sales.flow.SalesFlow.core.entities.users.customers.Customers;
import java.time.LocalDateTime;

public class Lead {

    Long id;
    private String nome;
    private String email;
    private String telefone;
    private String empresa;
    private LeadStatus status;
    private LocalDateTime criadoEm;
    private Customers customer;

    public Lead() {
    }

    public Lead(Long id, String nome, String email, String telefone, String empresa, LeadStatus status, LocalDateTime criadoEm, Customers customer) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.empresa = empresa;
        this.status = status;
        this.criadoEm = criadoEm;
        this.customer = customer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public LeadStatus getStatus() {
        return status;
    }

    public void setStatus(LeadStatus status) {
        this.status = status;
    }

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(LocalDateTime criadoEm) {
        this.criadoEm = criadoEm;
    }

    public Customers getCustomer() {
        return customer;
    }

    public void setCustomer(Customers customer) {
        this.customer = customer;
    }
}