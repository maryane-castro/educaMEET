import { Card } from 'react-bootstrap';
import "./EventCard.css";

function EventCard() {
  return (
    <Card className="custom-card mb-3 ms-3 me-3">
      <Card.Body>
        <Card.Title>DATA DO EVENTO</Card.Title>
        <Card.Text>
          FOLDER DO EVENTO.
        </Card.Text>
      </Card.Body>
    </Card>
  );
}

export default EventCard;