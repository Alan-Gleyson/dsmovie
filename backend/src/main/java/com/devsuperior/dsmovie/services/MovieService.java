package com.devsuperior.dsmovie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsmovie.dto.MovieDTO;
import com.devsuperior.dsmovie.entities.Movie;
import com.devsuperior.dsmovie.repositories.MovieRepository;

//(anotation services) registra a class customizada "MovieServices" 
//como componente do sistema 

@Service
public class MovieService {
	
	@Autowired
	public MovieRepository repository;
	
	// "@Transactional" garanti q esse metódo resolva tudo q for da 
	//JPA de transação nesssa camada de srviço 
	@Transactional(readOnly = true)
	public Page<MovieDTO> findAll(Pageable pageable) {
		//realiza transação de buscar os filmes
		Page<Movie> result = repository.findAll(pageable);
		//função de alta ordem "Page<MovieDTO>"
		Page<MovieDTO> page = result.map(x -> new MovieDTO(x));
		return page;
	}
	
	@Transactional(readOnly = true)
	public MovieDTO findById(Long id) {
		//realiza transação de buscar um único filme
		Movie result = repository.findById(id).get();
		//função de alta ordem "Page<MovieDTO>"
		MovieDTO dto = new MovieDTO(result);
		return dto;
	}
	
}
