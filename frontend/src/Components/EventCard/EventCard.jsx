import React from 'react';
import Card from 'react-bootstrap/Card';
import ListGroup from 'react-bootstrap/ListGroup';
import {BsCalendarEvent} from "react-icons/bs"
import {GoLocation} from "react-icons/go"
import { Link } from "react-router-dom";
import "./EventCard.css";


import EventFolder from "../../assets/event-folder.svg"

function EventCard() {
  return (
  
    <Card className="custom-card">
      <Card.Img className='event-img' variant="top" src={EventFolder}/>
      <Card.Body>
        <Card.Title>Event Title</Card.Title>
        <Card.Text>
        Lorem ipsum dolor sit amet consectetur adipisicing elit.   
        </Card.Text>
        <ListGroup className="list-group-flush">
          <ListGroup.Item className="d-flex align-items-center">
            <BsCalendarEvent/> <div className='ps-2'>16/03/23</div>
          </ListGroup.Item>
          <ListGroup.Item className="d-flex align-items-center">
            <GoLocation/> <div className='ps-2'> Algum lugar </div>
          </ListGroup.Item>
          <ListGroup.Item className="d-flex align-items-center">
            <Link to="/event">
              <div className="btn custom-btn">Saiba mais</div>
            </Link>
          </ListGroup.Item>
        </ListGroup>
        
      </Card.Body>
    </Card>
  );
}

export default EventCard;