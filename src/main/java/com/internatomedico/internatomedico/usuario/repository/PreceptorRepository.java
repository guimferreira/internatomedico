package com.internatomedico.internatomedico.usuario.repository;

import com.internatomedico.internatomedico.usuario.entity.Preceptor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreceptorRepository extends JpaRepository<Preceptor, Long> {
}
