package com.sales.flow.SalesFlow.core.entities.cotacoes;

public enum CotacoesStatus {

    ABERTA,
    APROVADA,
    REJEITADA,
    EXPIRADA;

    public static CotacoesStatus fromString(String status) {
        for (CotacoesStatus cs : CotacoesStatus.values()) {
            if (cs.name().equalsIgnoreCase(status)) {
                return cs;
            }
        }
        throw new IllegalArgumentException("Status de cotação inválido: " + status);
    }
}