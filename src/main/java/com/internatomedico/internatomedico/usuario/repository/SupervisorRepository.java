package com.internatomedico.internatomedico.usuario.repository;

import com.internatomedico.internatomedico.usuario.entity.Supervisor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupervisorRepository extends JpaRepository<Supervisor, Long> {
}
