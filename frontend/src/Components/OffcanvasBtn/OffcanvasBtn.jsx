import React from "react";
import { Fragment } from "react";
import {CgMenuGridR} from "react-icons/cg";

const OffcanvasBtn = () => {

    const customBtn = {
        padding: "0",
        border: "0"
    };


    return(
        <Fragment>
            <button className="btn" style={customBtn}
             type="button" 
             data-bs-toggle="offcanvas" 
             data-bs-target="#offcanvasWithBothOptions" 
             aria-controls="offcanvasWithBothOptions">
                <CgMenuGridR style={{fontSize:"30px"}}/>
            </button>
        </Fragment>
    );
};

export default OffcanvasBtn;