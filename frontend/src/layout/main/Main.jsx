import {Fragment} from "react";
import {Outlet} from "react-router-dom";
import Navbar from '../../Components/Navbar/Navbar';
import Sidebar from '../../Components/sidebar/Sidebar';
import Offcanvas from '../../Components/Offcanvas/Offcanvas';
import { useMediaQuery } from 'react-responsive';
import React from "react";

const Main = () => {
    const resolutionSmallerThanXL = useMediaQuery({
        query: '(min-width: 1200px)'
    });

    return(
        <Fragment>
            <Navbar/>
            <div className="container pt-5 mt-3">
                <div className="row">
                    {resolutionSmallerThanXL &&
                        <div className=" col-lg-12 col-xl-4 col-xxl-4">
                            <Sidebar/>
                        </div>
                    }
                    <div className=" mt-4 col-12 col-sm-12 col-md-12 col-lg-12 col-xl-8 col-xxl-8">
                        <Outlet/>
                    </div>
                </div> 
            </div>
            <Offcanvas/>
        </Fragment>
    );
};

export default Main;