package com.abiltondias.cursosmc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abiltondias.cursosmc.domain.Pedido;

@Repository
public interface PedidosRepository extends JpaRepository<Pedido, Integer>{

}
