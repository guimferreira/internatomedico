package com.internatomedico.internatomedico.shared.repository;

import com.internatomedico.internatomedico.shared.entity.PeriodoEspecialidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeriodoEspecialidadeRepository extends JpaRepository<PeriodoEspecialidade, Long> {
}
