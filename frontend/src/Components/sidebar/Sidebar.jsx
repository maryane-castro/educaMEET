
import Calendar from 'react-calendar';
import 'react-calendar/dist/Calendar.css';
import Profile from '../profile/Profile';

const Sidebar = () => {
    return(
        <div className="card mt-4 border-color-eton shadow-border">
            <div className="card-body">
                <Profile/>
                <div className='row'>
                    <div className="col-12 mt-5 d-flex justify-content-center align-items-center">
                        <Calendar/>
                    </div>
                    <div className="col">
                        
                    </div>
                </div>
            </div>
        </div>
    );
};


export default Sidebar;


