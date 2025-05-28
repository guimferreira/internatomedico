package com.internatomedico.internatomedico.usuario.aluno.repository;

import com.internatomedico.internatomedico.usuario.aluno.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
