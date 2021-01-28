package br.com.CaixaEletronico.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.CaixaEletronico.models.Cliente;
import br.com.CaixaEletronico.repositories.ClienteRepository;

@Service
public class ClienteService {
    
    @Autowired
    ClienteRepository cr;

    public void salvar(Cliente c) {

        cr.save(c);
        
    }

}
