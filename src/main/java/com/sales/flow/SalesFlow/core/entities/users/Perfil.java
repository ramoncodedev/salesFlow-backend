package com.sales.flow.SalesFlow.core.entities.users;

public enum Perfil {

    ADMIN,
    VENDEDOR,
    GERENTE;

    public static Perfil fromString(String perfil) {
        for (Perfil p : Perfil.values()) {
            if (p.name().equalsIgnoreCase(perfil)) {
                return p;
            }
        }
        throw new IllegalArgumentException("Perfil inválido: " + perfil);
    }
}