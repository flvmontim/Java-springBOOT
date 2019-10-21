package br.com.estudo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.estudo.entities.Cliente;
import br.com.estudo.repository.ClienteDAO;


@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	ClienteDAO clienteDao;
	
	@GetMapping
	public List<Cliente> listaClientes() {
		return clienteDao.findAll();
	}
	
	@PostMapping
	public void insereCliente(@RequestBody Cliente cliente) {
		clienteDao.save(cliente);
	}
	
	@DeleteMapping(value = "/{id}")
	public void deleteCliente(@PathVariable("id") Integer id) {
		clienteDao.deleteById(id);
	}
	
	@PutMapping
	public void editarCliente(@RequestBody Cliente cliente) {
		clienteDao.save(cliente);
	}
}