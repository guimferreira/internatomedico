package com.internatomedico.internatomedico.atendimento.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.internatomedico.internatomedico.usuario.entity.Preceptor;
import com.internatomedico.internatomedico.shared.entity.LocalEspecialidade;
import com.internatomedico.internatomedico.academico.enums.Turno;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@Entity
@Getter
@NoArgsConstructor
@Setter
@Table(name = "plantoes")
public class Plantao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "data_inicio")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataInicio;

    @Column(name = "data_fim")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataFim;

    @Enumerated(EnumType.STRING)
    @Column(name = "turno")
    private Turno turno;

    @ManyToOne
    @JoinColumn(name = "local_especialidade_id", nullable = false)
    private LocalEspecialidade localEspecialidade;

    @Column(name = "vagas")
    private Integer vagas;

    @ManyToOne
    @JoinColumn(name = "preceptor_id", nullable = true)
    private Preceptor preceptor;
}
