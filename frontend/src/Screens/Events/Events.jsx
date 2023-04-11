
import EventCard from '../../Components/EventCard/EventCard';


const Events = () => {


    return(
        <div className='container-fluid'>
            <div className='row gutter align-items-center'>
                {/*events.map((evt) => (
                    <div key={evt.id} className='mb-3 d-flex justify-content-center col-12 col-sm-6 col-md-6 col-lg-6 col-xl-4 col-xl-4'>
                        <EventCard 
                        id={evt.id}
                        name={evt.name}
                        campus={evt.campus}
                        startDate={evt.startDate}
                        endDate={evt.endDate}
                        details={evt.details}
                        folder={evt.folder} />
                    </div>
                ))*/}                
            </div>
        </div>
    )
}

export default Events;