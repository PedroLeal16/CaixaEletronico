package br.com.CaixaEletronico.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.CaixaEletronico.models.Cliente;
import br.com.CaixaEletronico.services.ClienteService;

@Controller
@RequestMapping("/cliente")
public class ClienteController {
    
    @Autowired
    ClienteService cs;
    
    @GetMapping("/test")
    public ResponseEntity<Cliente> test() {

        Cliente c = new Cliente("Pedro", "46864816869", "1606");
        cs.salvar(c);
        
        return ResponseEntity.ok().body(c);
    }

}
