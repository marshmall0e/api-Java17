package com.sistema_servicos.api_rest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sistema_servicos.api_rest.Models.Equipamento;

public interface EquipamentoRepository  extends JpaRepository<Equipamento, Long> {
    // Consultas personalizadas podem ser adicionadas aqui
}