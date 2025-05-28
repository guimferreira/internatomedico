package com.internatomedico.internatomedico.shared.localEspecialidade.repository;

import com.internatomedico.internatomedico.shared.localEspecialidade.LocalEspecialidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalEspecialidadeRepository extends JpaRepository<LocalEspecialidade, Long> {
}
