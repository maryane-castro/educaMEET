import { Card } from 'react-bootstrap';
import "./EventCard.css";

function EventCard() {
  return (
    <Card className="square custom-card">
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