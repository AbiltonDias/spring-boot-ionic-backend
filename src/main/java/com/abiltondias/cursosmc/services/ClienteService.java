package com.abiltondias.cursosmc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abiltondias.cursosmc.domain.Cliente;
import com.abiltondias.cursosmc.repositories.ClientesRepository;


@Service
public class ClienteService {
	@Autowired
	private ClientesRepository repo;
	
	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElse(null);
	}
}
