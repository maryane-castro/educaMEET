import {Fragment} from "react";
import {Outlet} from "react-router-dom";
import Navbar from "../../Components/Navbar/Navbar";
import Profile from "../../Components/Profile/Profile";
import Offcanvas from "../../Components/Offcanvas/Offcanvas";
import { useMediaQuery } from 'react-responsive';
import React from "react";
import "./Layout.css"

const Layout = () => {
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
                            <Profile/>
                        </div>
                    }
                    <div className="col-12 col-sm-12 col-md-12 col-lg-12 col-xl-8 col-xxl-8">
                        <Outlet/>
                    </div>
                </div> 
            </div>
            <Offcanvas/>
        </Fragment>
    );
};

export default Layout;