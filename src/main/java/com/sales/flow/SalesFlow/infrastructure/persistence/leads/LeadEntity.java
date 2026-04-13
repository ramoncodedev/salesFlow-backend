package com.sales.flow.SalesFlow.infrastructure.persistence.leads;

import com.sales.flow.SalesFlow.core.entities.leads.LeadStatus;
import com.sales.flow.SalesFlow.infrastructure.persistence.users.CustomersEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "leads")
public class LeadEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 260, nullable = false)
    private String nome;

    @Column(length = 260, nullable = false)
    private String email;

    @Column(length = 260)
    private String telefone;

    @Column(length = 260)
    private String empresa;

    @Enumerated(EnumType.STRING)
    @Column(length = 50, nullable = false)
    private LeadStatus status;

    @CreationTimestamp
    private LocalDateTime criadoEm;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private CustomersEntity customer;
}