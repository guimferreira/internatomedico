package com.internatomedico.internatomedico.atendimento.checkin;

import com.internatomedico.internatomedico.atendimento.plantao.Plantao;
import com.internatomedico.internatomedico.usuario.aluno.Aluno;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Entity
@Getter
@NoArgsConstructor
@Setter
@Table(name = "chekins")
public class CheckIn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "data_hora_checkIn")
    private LocalDateTime dataHoraCheckIn;

    @Column(name = "data_hora_checkOut")
    private LocalDateTime dataHoraCheckOut;

    @Column(name = "latitude")
    private Double latitude;

    @Column(name = "longitude")
    private Double longitude;

    @Column(name = "validacao")
    private Boolean validacao;

    @ManyToOne
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

    @ManyToOne
    @JoinColumn(name = "plantao_id")
    private Plantao plantao;
}
