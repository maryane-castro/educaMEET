import React from "react";
import { Fragment } from "react";

const Thumbnail = () => {
    return(
        <Fragment>
            <img 
            style={{maxHeight:'30px'}}
            src="https://media.geeksforgeeks.org/wp-content/cdn-uploads/20190710102234/download3.png" 
            className=" p-0 img-thumbnail rounded-circle" 
            alt="GFG"
            />
        </Fragment>
    );
};

export default Thumbnail;