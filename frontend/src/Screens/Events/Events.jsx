/*Criar Evento*/
import { useState, useEffect } from 'react';
import EventServices from '../../services/event.service';
import EventCard from '../../Components/EventCard/EventCard';

const Events = () => {
    const [events, setEvents] = useState([]);

    const getEvents = async () =>{
        try {
            const data  = await EventServices.getAll();
            setEvents(data);
        } catch (error) {
            console.log({message:error.message}); 
        }
    }
    
    useEffect(()=>{
        getEvents();
    },[]);

    return(
        <div className='container-fluid'>
            <div className='row align-items-center'>
                {events.map((evt) => (
                    <div key={evt.id} className='mb-3 d-flex justify-content-center col-12 col-sm-6 col-md-4 col-lg-6 col-xl-4 col-xl-4'>
                        <EventCard 
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