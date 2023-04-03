
import Calendar from 'react-calendar';
import { calendarOptions } from '../../calendar/config';
import Profile from '../profile/Profile';
import {Link} from 'react-router-dom';
import { Fragment } from 'react';
const Sidebar = () => {
    return(
        <Fragment>
            <div className="card-body">
                <Profile/>
                <div className='row'>
                    <div className="top-border col-12 mt-3 pt-4 d-flex justify-content-center align-items-center">
                        <Calendar {...calendarOptions}/>
                    </div>
                    <div className="col-12 pt-3">
                        <Link to='/dashboard'>
                            <div className="btn custom-button w-100">Dashboard</div>
                        </Link>
                    </div>
                </div>
            </div>
        </Fragment>
    );
};


export default Sidebar;


