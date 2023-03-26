import React from 'react';
import {BsCalendarEvent} from "react-icons/bs"
import {GoLocation} from "react-icons/go"
import { Link } from "react-router-dom";
import "./EventCard.css";


import EventFolder from "../../assets/event-folder.svg"

function EventCard() {
  return (
      <div className="card mt-4">
        <img src={EventFolder} className="card-img-top" alt="..."/>
        <div className="card-body">
          <h5 className="card-title">Card title</h5>
        </div>
        <ul className="list-group list-group-flush">
          <li className="list-group-item">
            <BsCalendarEvent/>
          </li>
          <li className="list-group-item">
            <GoLocation/>
          </li>
        </ul>
        <div className="card-body">
          <Link to="/event">
            <div className="btn bg-color">Saiba mais</div>
          </Link>
        </div>
      </div>
  );
}

export default EventCard;
