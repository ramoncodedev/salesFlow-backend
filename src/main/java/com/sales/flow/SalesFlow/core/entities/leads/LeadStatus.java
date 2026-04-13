package com.sales.flow.SalesFlow.core.entities.leads;

public enum LeadStatus {

    NOVO,
    CONTATADO,
    QUALIFICADO,
    NAO_INTERESSADO,
    CONVERTIDO;

    public static LeadStatus fromString(String status) {
        for (LeadStatus ls : LeadStatus.values()) {
            if (ls.name().equalsIgnoreCase(status)) {
                return ls;
            }
        }
        throw new IllegalArgumentException("Status de lead inválido: " + status);
    }
}