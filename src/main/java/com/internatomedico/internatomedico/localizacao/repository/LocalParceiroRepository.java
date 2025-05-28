package com.internatomedico.internatomedico.localizacao.repository;

import com.internatomedico.internatomedico.localizacao.entity.LocalParceiro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalParceiroRepository extends JpaRepository<LocalParceiro, Long> {
}
