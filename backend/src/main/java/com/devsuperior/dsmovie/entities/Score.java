package com.devsuperior.dsmovie.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score")
public class Score {
	//ref. para Movie
	//private-Movie-movie;
	//ref. para User
	//private-User-user;
	
	//JPA id de usuário atributo único
	//indentificador do movie-user são chaves compostas
	//duas chaves devem ser criadas em outra classe 
	//e ter uma única referência aqui ligando a elas 
	
	// "new" pra garantir que será instanciado
	//ScorePK é id-composto - logo usa @Embed
	@EmbeddedId
	private ScorePK id = new ScorePK();
	
	private Double value;

	public Score() {
	}

	//associar um filme a um score
	public void setMovie(Movie movie) {
		id.setMovie(movie);
	}
	
	//associar um user a um score
	public void setUser(User user) {
		id.setUser(user);
	}
	
	public ScorePK getId() {
		return id;
	}

	public void setId(ScorePK id) {
		this.id = id;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
}
