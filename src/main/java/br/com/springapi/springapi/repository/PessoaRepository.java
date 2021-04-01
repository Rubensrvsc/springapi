package br.com.springapi.springapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.springapi.springapi.entity.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa,Long> {
    
}
