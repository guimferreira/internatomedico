package com.internatomedico.internatomedico.atendimento.repository;

import com.internatomedico.internatomedico.atendimento.entity.CheckIn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckInRepository extends JpaRepository<CheckIn, Long> {
}
