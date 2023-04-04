import React from 'react';
import {BsCalendarEvent} from "react-icons/bs"
import {GoLocation} from "react-icons/go" 
import AvatarsComponent from '../avatarComponent/avatarComponent';



import EventFolder from "../../assets/event-folder.svg"

function EventCard({name, campus, startDate, endDate, details, folder, id}) {
  return (
      <div className=" custom-card card shadow-border">
          <img src={EventFolder} className="card-img-top" alt="..."/>
            <div className="row pt-1 card-body event-card-body">
              <h4 className=" col-12 card-title">
                  <div className='event-name'>{name}</div>
              </h4>
              <div className='pb-1 col-12 d-flex align-items-center'>
                <BsCalendarEvent className='icon-size me-1'/>
                <div className='adress-fontsize'>
                  {startDate}
                </div>
              </div>
              <div className='col-12 d-flex align-items-center '>
                <GoLocation className='icon-size me-1'/>
                <div className='adress-fontsize'>
                  {campus}
                </div>
              </div>
              <div className=" col-12">
                <AvatarsComponent/>
              </div>
            </div>
      </div>
  );
}

export default EventCard;
