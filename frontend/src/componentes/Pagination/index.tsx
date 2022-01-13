import React from 'react';
// o neme Arrow do ReactComponent, não pode ser igual do 'assets/img/arrow.svg': crasha
import {ReactComponent as Arrow} from 'assets/img/arrow.svg';
import "./styles.css"

function Pagination() {

	return (
		<div className="dsmovie-pagination-container">
    		<div className="dsmovie-pagination-box">
        		<button className="dsmovie-pagination-button" disabled={true} >
            		<Arrow />
      			</button>
        		<p>{`${1} de ${3}`}</p>
        		<button className="dsmovie-pagination-button" disabled={false} >
            		<Arrow className="dsmovie-flip-horizontal" />
        		</button>
   			</div>
		</div>
	);
}

export default Pagination;