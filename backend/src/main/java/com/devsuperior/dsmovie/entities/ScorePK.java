package com.devsuperior.dsmovie.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

//PrimaryKey -PK- para o Score.java
@Embeddable
public class ScorePK implements Serializable {

	private static final long serialVersionUID = 1L;
	// no banco relacional isso são chaves extrangeiras
	//ref. para Movie
	@ManyToOne
	@JoinColumn(name = "movie_id") 
	private Movie movie;
	//ref. para User
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	public ScorePK() {
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
}
