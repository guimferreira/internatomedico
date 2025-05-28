package com.internatomedico.internatomedico.shared.entity;

import com.internatomedico.internatomedico.academico.entity.Especialidade;
import com.internatomedico.internatomedico.academico.entity.SemestreLetivo;
import com.internatomedico.internatomedico.localizacao.entity.LocalParceiro;
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
@Table(name = "local_especialidade")
public class LocalEspecialidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "local_parceiro_id")
    private LocalParceiro localParceiro;

    @ManyToOne
    @JoinColumn(name = "especialidade_id")
    private Especialidade especialidade;

    @ManyToOne
    @JoinColumn(name = "semestre_id")
    private SemestreLetivo semestreLetivo;

    @Column(name = "vagas")
    private Integer vagas;
}