package com.br.EstudoH2eCrudJPA.repository;

import com.br.EstudoH2eCrudJPA.pessoaEntity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}