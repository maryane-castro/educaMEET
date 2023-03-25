import {Fragment} from "react";
import {Outlet} from "react-router-dom";
import Navbar from "../../Components/Navbar/Navbar";
import Profile from "../../Components/Profile/Profile";
import React from "react";
import "./Layout.css"

const Layout = () => {
    return(
        <Fragment>
            <Navbar/>
            <div className="container pt-5 mt-3">
                <div className="row">
                    <div className="col">
                        <Profile/>
                    </div>
                    <div className="col-12 col-sm-12 col-md-12 col-lg-12 col-xl-8 col-xxl-8">
                        <Outlet/>
                    </div>

                </div> 
            </div>
        </Fragment>
    );
};

export default Layout;