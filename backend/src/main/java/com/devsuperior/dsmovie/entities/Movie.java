package com.devsuperior.dsmovie.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//mapeamento objeto-relacional do Bd
@Entity
@Table(name = "tb_movie")
public class Movie {
	//padrão atributos privados , incluir métodos de acesso GetSet
	
	@Id //indicar q o id sera PK do banco
	//generatedvalue indica q o id sera autoimplementavel no bd
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	private String title;
	private Double score;
	private Integer count;
	private String image;
	
	//Construtor Movie instanciado
	public Movie() {
	}

	public Movie(Long id, String title, Double score, Integer count, String image) {
		//super();apagado por não ter herança
		this.id = id;
		this.title = title;
		this.score = score;
		this.count = count;
		this.image = image;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTile(String title) {
		this.title = title;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	
}

