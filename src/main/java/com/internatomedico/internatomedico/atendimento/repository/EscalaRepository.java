package com.internatomedico.internatomedico.atendimento.repository;

import com.internatomedico.internatomedico.atendimento.entity.Escala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EscalaRepository extends JpaRepository<Escala, Long> {
}
