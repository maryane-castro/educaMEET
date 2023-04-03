import React from "react";
import { Fragment } from "react";
import Sidebar from "../sidebar/Sidebar";
const Offcanvas = () => {
    return(
        <Fragment>
            <div className="offcanvas offcanvas-start position-absolute" data-bs-scroll="true" tabIndex="-1" id="offcanvasWithBothOptions" aria-labelledby="offcanvasWithBothOptionsLabel">
                <div className="offcanvas-body position-absolute">
                    <Sidebar/>
                </div>
                <div className="offcanvas-header position-relative">
                    <h5 className="offcanvas-title" id="offcanvasWithBothOptionsLabel"> </h5>
                    <button type="button" className="btn-close" data-bs-dismiss="offcanvas" aria-label="Close"></button>
                </div>  
            </div>
        </Fragment>
    );
};

export default Offcanvas;