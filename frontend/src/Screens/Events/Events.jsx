
import EventCard from '../../Components/EventCard/EventCard';
import "./Events.css"

const Events = () => {
    return(
        <div className='container-fluid'>
            <div className='row'>
                <div className=' d-flex justify-content-center col-12 col-sm-12 col-md-12 col-lg-6 col-xl-6 col-xl-6'>
                    <EventCard/>
                </div>
                <div className=' d-flex justify-content-center col-12 col-sm-12 col-md-12 col-lg-6 col-xl-6 col-xl-6'>
                    <EventCard/>
                </div>
                <div className=' d-flex justify-content-center col-12 col-sm-12 col-md-12 col-lg-6 col-xl-6 col-xl-6'>
                    <EventCard/>
                </div>
                <div className=' d-flex justify-content-center col-12 col-sm-12 col-md-12 col-lg-6 col-xl-6 col-xl-6'>
                    <EventCard/>
                </div>
                <div className=' d-flex justify-content-center col-12 col-sm-12 col-md-12 col-lg-6 col-xl-6 col-xl-6'>
                    <EventCard/>
                </div>
                <div className=' d-flex justify-content-center col-12 col-sm-12 col-md-12 col-lg-6 col-xl-6 col-xl-6'>
                    <EventCard/>
                </div>
            </div>
        </div>
    )
}

export default Events;