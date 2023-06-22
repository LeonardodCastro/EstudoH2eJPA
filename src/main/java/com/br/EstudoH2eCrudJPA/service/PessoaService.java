package com.br.EstudoH2eCrudJPA.service;

import com.br.EstudoH2eCrudJPA.pessoaEntity.Pessoa;
import com.br.EstudoH2eCrudJPA.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {
    @Autowired
    private PessoaRepository pessoaRepository;

    public Pessoa salvar(Pessoa pessoa){

        return pessoaRepository.save(pessoa);
    }
    public List<Pessoa> listaPessoas(){
        return pessoaRepository.findAll();
    }
    public Optional<Pessoa> buscarPorId(Long id){
        return pessoaRepository.findById(id);
    }
    public void removerPorId(Long id){
        pessoaRepository.deleteById(id);
    }

}
