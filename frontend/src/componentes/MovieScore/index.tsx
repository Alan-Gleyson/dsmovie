import React from 'react';
import MovieStars from "componentes/MovieStars";
import './styles.css';

function MovieScore() {
	// variavés pra fim de teste 
	const score=-1;

	const count=13;

	return (
		<div className="dsmovie-score-container">
			{/*condicional ternária "{score > 0 ? score.toFixed(1) : '-'}"*/}
			<p className="dsmovie-score-value"> {score > 0 ? score.toFixed(1) : '-'}</p>
			<MovieStars />	
			<p className="dsmovie-score-count">{count} avaliações</p>
		</div>		
	);
}

export default MovieScore;