package com.abiltondias.cursosmc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abiltondias.cursosmc.domain.Pedido;
import com.abiltondias.cursosmc.repositories.PedidosRepository;
import com.abiltondias.cursosmc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	@Autowired
	private PedidosRepository repo;
	
	public Pedido find(Integer id) {
		
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id
				+ ", Tipo: " + Pedido.class.getName()));
		
	}
}
