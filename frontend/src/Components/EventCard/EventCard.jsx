import React from 'react';
import {BsCalendarEvent} from "react-icons/bs"
import {GoLocation} from "react-icons/go"
import { Link } from "react-router-dom";



import EventFolder from "../../assets/event-folder.svg"

function EventCard() {
  return (
      <div className="card shadow-border">
          <img src={EventFolder} className="card-img-top" alt="..."/>
            <div className="row align-items-center card-body">
              <h4 className=" col-12 card-title">
                <strong>
                Card title
                </strong>
              </h4>
              <div className='col-2 d-flex align-items-center justify-content-center'>
                <BsCalendarEvent className='icon-size'/>
              </div>
              <div className='col-10 ps-0'>
                <div className='adress-fontsize'>
                  12/03/23
                </div>
              </div>
              <div className='col-2 d-flex align-items-center justify-content-center'>
                <GoLocation className='icon-size'/>
              </div>
              <div className='col-10 ps-0'>
                <div className='adress-fontsize'>R. Dr. Siqueira, 273 - Parque Dom Bosco, Campos dos Goytacazes - RJ, 28030-130</div>
              </div>
              <div className=" col-sm-6-off-set-3 mt-2 mb-2">
              <Link  to="/event">
                <div className="custom-button btn w-100">Saiba mais</div>
              </Link>
              </div>
            </div>
      </div>
  );
}

export default EventCard;
