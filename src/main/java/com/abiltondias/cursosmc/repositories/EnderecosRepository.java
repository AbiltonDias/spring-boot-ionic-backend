package com.abiltondias.cursosmc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abiltondias.cursosmc.domain.Endereco;

@Repository
public interface EnderecosRepository extends JpaRepository<Endereco, Integer>{

}
