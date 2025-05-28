package com.internatomedico.internatomedico.atendimento.plantao.repository;

import com.internatomedico.internatomedico.atendimento.plantao.Plantao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlantaoRepository extends JpaRepository<Plantao, Long> {
}
