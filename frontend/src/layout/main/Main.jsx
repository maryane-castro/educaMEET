import {Fragment} from "react";
import {Outlet} from "react-router-dom";
import Navbar from '../../Components/Navbar/Navbar';
import { useMediaQuery } from 'react-responsive';
import React from "react";
import Modal from "../../Components/modal/modal";
import FloatMenu from "../../Components/floatMenu/floatMenu";
import CalendarComponent from "../../Components/calendarComponent";
import Profile from "../../Components/profile/Profile";


const Main = () => {

  

    const resolutionSmallerThanXL = useMediaQuery({
        query: '(min-width: 992px)'
    });

    return(
            <Fragment>
                <Navbar/>
                <div className="container pt-5 mt-3">
                    <div className="row gutter">
                    
                        {resolutionSmallerThanXL &&
                            <div className="d-flex flex-column align-items-center col-lg-4 col-xl-4 col-xxl-4">
                                <div className="profile mt-4 position-relative">
                                    <Profile/>
                                </div>
                                <div className="mt-4 position-relative">
                                    <CalendarComponent/>
                                </div>
                            </div>
                        }
                        <div className="mt-4 col-12 col-sm-12 col-md-12 col-lg-8 col-xl-8 col-xxl-8">
                            <Outlet/>
                        </div>
                    </div> 
                    <FloatMenu/>
                </div>
                <Modal/>
            </Fragment>
    );
};

export default Main;