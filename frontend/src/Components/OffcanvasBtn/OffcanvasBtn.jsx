import React from "react";
import { Fragment } from "react";
import {CgMenuGridR} from "react-icons/cg";

const OffcanvasBtn = () => {
    return(
        <Fragment>
            <button className="btn"
             type="button" 
             data-bs-toggle="offcanvas" 
             data-bs-target="#offcanvasWithBothOptions" 
             aria-controls="offcanvasWithBothOptions">
                <CgMenuGridR/>
            </button>
        </Fragment>
    );
};

export default OffcanvasBtn;