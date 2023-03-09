import Container from 'react-bootstrap/Container';
import EventCard from '../../Components/EventCard/EventCard';
import "./Events.css"
const Events = () => {
    return(
        <Container fluid className="events-container custom-events d-flex pt-4 justify-content-evenly flex-wrap">
           <EventCard/>
           <EventCard/>
           <EventCard/>
        </Container>
    )
}

export default Events;