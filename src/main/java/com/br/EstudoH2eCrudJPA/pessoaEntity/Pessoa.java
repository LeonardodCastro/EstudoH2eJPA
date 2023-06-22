package com.br.EstudoH2eCrudJPA.pessoaEntity;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @Column(name = "Nome")
    private String nome;
    @Column(name = "Come_Comida")
    private boolean comeComida;
    @Column(name = "Numero_da_sorte")
    private int numeroDaSorte;

}
