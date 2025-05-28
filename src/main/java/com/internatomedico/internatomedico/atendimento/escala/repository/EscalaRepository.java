package com.internatomedico.internatomedico.atendimento.escala.repository;

import com.internatomedico.internatomedico.atendimento.escala.Escala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EscalaRepository extends JpaRepository<Escala, Long> {
}
