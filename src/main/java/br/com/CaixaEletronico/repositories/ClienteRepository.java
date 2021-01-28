package br.com.CaixaEletronico.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.CaixaEletronico.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
}
