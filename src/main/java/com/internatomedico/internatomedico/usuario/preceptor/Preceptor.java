package com.internatomedico.internatomedico.usuario.preceptor;

import com.internatomedico.internatomedico.academico.especialidade.Especialidade;
import com.internatomedico.internatomedico.usuario.Usuario;
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
@Table(name = "preceptores")
public class Preceptor extends Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_preceptor")
    private Long id;

    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @Column(name = "crm", length = 9)
    private String crm;

    @ManyToOne
    @JoinColumn(name = "especialidade_id")
    private Especialidade especialidade;

}
