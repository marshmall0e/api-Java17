package com.sistema_servicos.api_rest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sistema_servicos.api_rest.Models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    // Consultas personalizadas podem ser adicionadas aqui
}