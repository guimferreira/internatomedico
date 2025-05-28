package com.internatomedico.internatomedico.shared.repository;

import com.internatomedico.internatomedico.shared.entity.LocalEspecialidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalEspecialidadeRepository extends JpaRepository<LocalEspecialidade, Long> {
}
