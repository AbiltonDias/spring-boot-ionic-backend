package com.abiltondias.cursosmc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abiltondias.cursosmc.domain.ItemPedido;

@Repository
public interface ItensPedidosRepository extends JpaRepository<ItemPedido, Integer>{

}
