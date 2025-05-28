package com.internatomedico.internatomedico.atendimento.checkin.repository;

import com.internatomedico.internatomedico.atendimento.checkin.CheckIn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckInRepository extends JpaRepository<CheckIn, Long> {
}
