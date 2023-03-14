import Container from 'react-bootstrap/Container';
import EventCard from '../../Components/EventCard/EventCard';
import "./Events.css"
const Events = () => {
    return(
        <Container fluid className="custom-events d-flex pt-4 justify-content-evenly flex-wrap gap-3">
           <EventCard/>
           <EventCard/>
           <EventCard/>
           <EventCard/>
           
        </Container>
    )
}

export default Events;