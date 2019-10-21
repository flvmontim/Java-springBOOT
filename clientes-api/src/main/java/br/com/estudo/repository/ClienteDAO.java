package br.com.estudo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.estudo.entities.Cliente;

public interface ClienteDAO extends JpaRepository<Cliente, Integer>{

}
