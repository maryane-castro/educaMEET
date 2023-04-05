import {Fragment} from "react";
import {Outlet} from "react-router-dom";
import Navbar from '../../Components/Navbar/Navbar';
import Sidebar from '../../Components/sidebar/Sidebar';
import Offcanvas from '../../Components/Offcanvas/Offcanvas';
import { useMediaQuery } from 'react-responsive';
import React from "react";
import Modal from "../../Components/modal/modal";


const Main = () => {
    const resolutionSmallerThanXL = useMediaQuery({
        query: '(min-width: 992px)'
    });

    return(
        <Fragment>
            <Navbar/>
            <div className="container pt-5 mt-3">
                <div className="row">
                
                    {resolutionSmallerThanXL &&
                        <div className=" col-lg-5 col-xl-4 col-xxl-4">
                            <div className="mt-4 position-relative card ps-3 pe-3 shadow-border">
                                <Sidebar/>  
                            </div>
                        </div>
                    }
                    <div className="mt-4 col-12 col-sm-11 col-md-11 col-lg-6 col-xl-7 col-xxl-7">
                        <Outlet/>
                    </div>

                </div> 
            </div>
            <Offcanvas/>
            <Modal/>
        </Fragment>
    );
};

export default Main;