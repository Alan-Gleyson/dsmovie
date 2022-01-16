package com.devsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie.entities.Movie;

//O objeto MovieRepository tem operações básicas (deletar, buscar, salvar, etc filmes no BD)_
//'class' trocado pra 'interface', added 'extends'(herda)	
public interface MovieRepository extends JpaRepository<Movie, Long>{

}
