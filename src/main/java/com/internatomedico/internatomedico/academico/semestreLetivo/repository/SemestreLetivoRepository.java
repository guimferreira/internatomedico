package com.internatomedico.internatomedico.academico.semestreLetivo.repository;

import com.internatomedico.internatomedico.academico.semestreLetivo.SemestreLetivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SemestreLetivoRepository extends JpaRepository<SemestreLetivo, Long> {
}
