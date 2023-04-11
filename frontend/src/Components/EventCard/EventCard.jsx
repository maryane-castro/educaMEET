import React from 'react';
import {BsCalendarEvent} from "react-icons/bs"
import {GoLocation} from "react-icons/go" 
import AvatarsComponent from '../avatarComponent/avatarComponent';


function EventCard({name, campus, startDate, endDate, details, folder, id}) {
  
  let cardFolder;
  try {
    cardFolder = require(`../../assets/crossfit.jpg`);
  } catch (error) {
    console.log(error);
  }
  
  
  return (
        <div className=" custom-card card shadow-border">
          <div className="row">
          <div className='col-12'>
              <img src={cardFolder} className="img-fluid rounded-top" alt="..."/>
            </div>
            <div className='col-12'>
              <div className="card-body event-card-body">
                <h4 className=" col- card-title">
                    <div className='event-name'>{name}</div>
                </h4>
                <div>{campus}</div>
                <div>Início: {startDate}</div>
                <div>Final: {endDate}</div>
              </div>
            </div>
          </div>  
        </div>
  );
}

export default EventCard;
