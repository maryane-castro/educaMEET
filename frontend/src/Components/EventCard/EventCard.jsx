import React from 'react';
import {BsCalendarEvent} from "react-icons/bs"
import {GoLocation} from "react-icons/go"
import { Link } from "react-router-dom";



import EventFolder from "../../assets/event-folder.svg"

function EventCard({name, campus, startDate, endDate, details, folder, id}) {
  return (
      <div className="card shadow-border">
          <img src={EventFolder} className="card-img-top" alt="..."/>
            <div className="row align-items-center card-body">
              <h4 className=" col-12 card-title">
                <strong>
                  {name}
                </strong>
              </h4>
              <div className='col-2 d-flex align-items-center justify-content-center'>
                <BsCalendarEvent className='icon-size'/>
              </div>
              <div className='col-10 ps-0'>
                <div className='adress-fontsize'>
                  {startDate}
                </div>
              </div>
              <div className='col-2 d-flex align-items-center justify-content-center'>
                <GoLocation className='icon-size'/>
              </div>
              <div className='col-10 ps-0'>
                <div className='adress-fontsize'>
                  {campus}
                </div>
              </div>
              <div className=" col-sm-6-off-set-3 mt-2 mb-2">
              <Link  to={`/event/${id}`}>
                <div className="custom-button btn w-100">Saiba mais</div>
              </Link>
              </div>
            </div>
      </div>
  );
}

export default EventCard;
