package com.internatomedico.internatomedico.academico.repository;

import com.internatomedico.internatomedico.academico.entity.SemestreLetivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SemestreLetivoRepository extends JpaRepository<SemestreLetivo, Long> {
}
