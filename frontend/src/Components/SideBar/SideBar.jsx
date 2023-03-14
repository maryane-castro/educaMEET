import React, { Fragment } from 'react';
import Collapse from 'react-bootstrap/Collapse';
import "./SideBar.css";

const SideBar = ({open}) => {
  return(
    <Fragment>
      <div className="fixed-left" style={{backgroundColor:"#121212"}}>
        <Collapse in={open} dimension="width">
          <div className="custom-sidebar" id="collapse-sidebar">
      
          </div>
        </Collapse>
      </div>
    </Fragment>
  );
}

export default SideBar;