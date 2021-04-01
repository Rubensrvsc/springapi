package br.com.springapi.springapi.controller;

import java.util.List;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.springapi.springapi.entity.Pessoa;
import br.com.springapi.springapi.repository.PessoaRepository;

@RestController
public class PessoaController {

    @Autowired
    private PessoaRepository pessoaRepository;

    @RequestMapping(value="/pessoa", method = RequestMethod.GET)
    public List<Pessoa> Get(){
       return pessoaRepository.findAll(); 
    }

    @RequestMapping(value="/pessoa",method = RequestMethod.POST)
    public Pessoa Post(@Valid @RequestBody Pessoa pessoa){
        return pessoaRepository.save(pessoa);
    }

    
    
}
