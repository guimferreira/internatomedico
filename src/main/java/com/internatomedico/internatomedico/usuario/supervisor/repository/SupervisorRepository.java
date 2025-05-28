package com.internatomedico.internatomedico.usuario.supervisor.repository;

import com.internatomedico.internatomedico.usuario.supervisor.Supervisor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupervisorRepository extends JpaRepository<Supervisor, Long> {
}
