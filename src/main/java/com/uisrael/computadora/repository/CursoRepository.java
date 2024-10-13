package com.uisrael.computadora.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uisrale.computadora.modelo.entity.Computadora;

@Repository
public interface CursoRepository extends JpaRepository<Computadora, Integer>  {
	
}
