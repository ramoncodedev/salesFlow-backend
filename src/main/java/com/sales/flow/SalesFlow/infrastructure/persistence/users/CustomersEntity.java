package com.sales.flow.SalesFlow.infrastructure.persistence.users;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
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
@Table(name = "customers")
public class CustomersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome do cliente é obrigatório")
    @Column(length = 260, nullable = false)
    private String name;

    @NotBlank(message = "O email do cliente é obrigatório")
    @Column(length = 260, nullable = false, unique = true)
    private String email;

    @NotBlank(message = "O telefone do cliente é obrigatório")
    @Column(length = 260, nullable = false)
    private String telefone;

    @Column(length = 260)
    private String empresa;

    @CreationTimestamp
    private LocalDateTime ultimoContato;
    @CreationTimestamp
    private LocalDateTime criadoEm;

}
