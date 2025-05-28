package com.internatomedico.internatomedico.usuario;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

@AllArgsConstructor
@Entity
@Getter
@Inheritance(strategy = InheritanceType.JOINED)
@NoArgsConstructor
@Setter
@Table(name = "usuarios")
public abstract class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    protected Long id;

    @Column(name = "nome")
    protected String nome;

    @Column(name = "email", unique = true)
    protected String email;

    @CPF
    @Column(name = "cpf", length = 11, unique = true)
    protected String cpf;
}
