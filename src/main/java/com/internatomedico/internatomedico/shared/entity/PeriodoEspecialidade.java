package com.internatomedico.internatomedico.shared.entity;

import com.internatomedico.internatomedico.academico.entity.Especialidade;
import com.internatomedico.internatomedico.academico.enums.PeriodoAcademico;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Entity
@Getter
@NoArgsConstructor
@Setter
@Table(name = "periodo_especialidade")
public class PeriodoEspecialidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "periodo_academico")
    private PeriodoAcademico periodoAcademico;

    @ManyToOne
    @JoinColumn(name = "especialidade_id")
    private Especialidade especialidade;

    @Column(name = "carga_horaria")
    private Integer cargaHoraria;
}
