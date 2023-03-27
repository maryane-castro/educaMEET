import React from "react";
import { Fragment } from "react";

const ProfileImg = () => {
    return(
        <Fragment>
            <img 
            style={{maxHeight:'150px'}}
            src="https://avatars.githubusercontent.com/u/954547?v=4" 
            className=" p-0 img-thumbnail rounded-circle border-color-eton" 
            alt="GFG"
            />
        </Fragment>
    );
};

export default ProfileImg;