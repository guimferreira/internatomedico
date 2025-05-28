package com.internatomedico.internatomedico.usuario.entity;

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
@Table(name = "alunos")
public class Aluno extends Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @Enumerated(EnumType.STRING)
    @Column(name = "periodo_academico")
    private PeriodoAcademico periodoAcademico;
}
