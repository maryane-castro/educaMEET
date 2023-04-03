import React from "react";
import { Fragment } from "react";

const Thumbnail = () => {
    return(
        <Fragment>
            <img 
            style={{maxHeight:'30px'}}
            src="https://avatars.githubusercontent.com/u/31219833?v=4" 
            className=" p-0 img-thumbnail rounded-circle border-color-eton" 
            alt="GFG"
            />
        </Fragment>
    );
};

export default Thumbnail;