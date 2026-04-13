-- V1__create_customers_table.sql
CREATE TABLE customers (
    id BIGSE

        RIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    telefone VARCHAR(50),
    empresa VARCHAR(255),
    ultimo_contato TIMESTAMP,
    criado_em TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE UNIQUE INDEX idx_customers_email ON customers(email);