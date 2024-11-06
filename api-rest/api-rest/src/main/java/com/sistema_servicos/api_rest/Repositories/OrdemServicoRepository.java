package com.sistema_servicos.api_rest.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import com.sistema_servicos.api_rest.Models.OrdemServico;

public interface OrdemServicoRepository extends JpaRepository<OrdemServico, Long> {
    // Consultas personalizadas podem ser adicionadas aqui
}

