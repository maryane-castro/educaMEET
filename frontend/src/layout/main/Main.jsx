import {Fragment} from "react";
import {Outlet} from "react-router-dom";
import Navbar from '../../Components/Navbar/Navbar';
import Sidebar from '../../Components/sidebar/Sidebar';
import Offcanvas from '../../Components/Offcanvas/Offcanvas';
import { useMediaQuery } from 'react-responsive';
import React from "react";

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
                            <div className="position-relative card ps-3 pe-3 mt-4  shadow-border">
                                <Sidebar/>  
                            </div>
                        </div>
                    }
                    <div className=" mt-4 col-12 col-sm-12 col-md-12 col-lg-7 col-xl-8 col-xxl-8">
                        <Outlet/>
                    </div>
                </div> 
            </div>
            <Offcanvas/>
        </Fragment>
    );
};

export default Main;