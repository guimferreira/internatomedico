package com.internatomedico.internatomedico.shared.periodoEspecialidade.repository;

import com.internatomedico.internatomedico.shared.periodoEspecialidade.PeriodoEspecialidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeriodoEspecialidadeRepository extends JpaRepository<PeriodoEspecialidade, Long> {
}
