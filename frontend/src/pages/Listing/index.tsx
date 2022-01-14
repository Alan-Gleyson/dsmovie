import React from 'react';
import Pagination from "componentes/Pagination";
// import MovieStars from "componentes/MovieStars";
// import MovieScore from "componentes/MovieScore";
import MovieCard from "componentes/MovieCard";
// function aceita somente um elemento
// ou uma div com vários elementos(isso add div a mais no projeto)
// ou usar 'frgment' = <> 
//                        <elem1/>
//                        <elem2/>
//                     </>

function Listing() {

	return (
		<>
			<Pagination />
			{/*<MovieStars />*/}
			{/*<MovieScore />*/}
			{/*Usando Bootstrap -breakpoints -Gridsystem*/}
			<div className="container">
				<div className="row">
					<div className="col-sm-6 col-lg-4 col-xl-3 mb-3">
						<MovieCard />
					</div>

					<div className="col-sm-6 col-lg-4 col-xl-3 mb-3">
						<MovieCard />
					</div>

					<div className="col-sm-6 col-lg-4 col-xl-3 mb-3">
						<MovieCard />
					</div>

					<div className="col-sm-6 col-lg-4 col-xl-3 mb-3">
						<MovieCard />
					</div>

					<div className="col-sm-6 col-lg-4 col-xl-3 mb-3">
						<MovieCard />
					</div>

					<div className="col-sm-6 col-lg-4 col-xl-3 mb-3">
						<MovieCard />
					</div>
			    </div>
			</div>
		</>
	);
}

export default Listing;