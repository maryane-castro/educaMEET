/*Criar Evento*/
import { useState, useEffect } from 'react';
import axios from 'axios';
import EventCard from '../../Components/EventCard/EventCard';

const Events = () => {
    const [events, setEvents] = useState([]);

    const getEvents = async ()  => {
        try {
            const response = await axios.get('http://localhost:8080/events');
            const data = response.data;
            setEvents(data);
        } catch (error) {
            console.log(error);
        }
    }

    useEffect(()=>{
        getEvents();
    },[]);

    return(
        <div className='container-fluid'>
            <div className='row'>
                {events.map((evt) => (
                    <div className=' mb-4 d-flex justify-content-center col-12 col-sm-12 col-md-12 col-lg-6 col-xl-6 col-xl-6'>
                        <EventCard 
                        key={evt.id}
                        id={evt.id}
                        name={evt.name}
                        campus={evt.campus}
                        startDate={evt.startDate}
                        endDate={evt.endDate}
                        details={evt.details}
                        folder={evt.folder} />
                    </div>
                ))}                
            </div>
        </div>
    )
}

export default Events;