package com.internatomedico.internatomedico.localizacao.localParceiro.repository;

import com.internatomedico.internatomedico.localizacao.localParceiro.LocalParceiro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalParceiroRepository extends JpaRepository<LocalParceiro, Long> {
}
