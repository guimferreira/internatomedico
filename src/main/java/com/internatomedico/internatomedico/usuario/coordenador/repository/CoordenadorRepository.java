package com.internatomedico.internatomedico.usuario.coordenador.repository;

import com.internatomedico.internatomedico.usuario.coordenador.Coordenador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoordenadorRepository extends JpaRepository<Coordenador, Long> {
}
