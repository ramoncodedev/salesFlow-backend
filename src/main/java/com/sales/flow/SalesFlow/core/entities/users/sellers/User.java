package com.sales.flow.SalesFlow.core.entities.users.sellers;

public class User {

    Long id;
    private String name;
    private String email;
    private String senha;
    private String perfil;

    public User() {
    }

    public User(Long id, String name, String email, String senha, String perfil) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.senha = senha;
        this.perfil = perfil;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
}