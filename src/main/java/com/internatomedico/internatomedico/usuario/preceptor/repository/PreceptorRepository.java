package com.internatomedico.internatomedico.usuario.preceptor.repository;

import com.internatomedico.internatomedico.usuario.preceptor.Preceptor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreceptorRepository extends JpaRepository<Preceptor, Long> {
}
