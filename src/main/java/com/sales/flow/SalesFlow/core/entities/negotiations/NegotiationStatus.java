package com.sales.flow.SalesFlow.core.entities.negotiations;

public enum NegotiationStatus {

    EM_NEGOCIACAO,
    FECHADA,
    PERDIDA,
    CANCELADA;

    public static NegotiationStatus fromString(String status) {
        for (NegotiationStatus ns : NegotiationStatus.values()) {
            if (ns.name().equalsIgnoreCase(status)) {
                return ns;
            }
        }
        throw new IllegalArgumentException("Status de negociação inválido: " + status);
    }
}