package com.internatomedico.internatomedico.academico.repository;

import com.internatomedico.internatomedico.academico.entity.Especialidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EspecialidadeRepository extends JpaRepository<Especialidade, Long> {
}
