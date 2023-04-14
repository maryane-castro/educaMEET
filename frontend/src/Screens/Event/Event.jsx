import FolderCard from "./FolderCard";
import EventInfo from "./EventInfo";
import { useParams } from "react-router-dom";



const Event = () => {
  const { id } = useParams();
  const events =  localStorage.getItem('events');
  const eventsObject = JSON.parse(events);
  const event = eventsObject.find((evt) => evt.id === parseInt(id));
  const {startDate, endDate, folder, details, name } = event;

  
  
  return(
    <div className="col-md-8 col-lg-9 vstack gap-4">
      <FolderCard name={name} folder={folder} startDate={startDate}/>
      <EventInfo startDate={startDate} endDate={endDate} details={details} name={name}/>
    </div>   
  );
};

export default Event;