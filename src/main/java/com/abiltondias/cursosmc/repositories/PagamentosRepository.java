package com.abiltondias.cursosmc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abiltondias.cursosmc.domain.Pagamento;

@Repository
public interface PagamentosRepository extends JpaRepository<Pagamento, Integer>{

}
