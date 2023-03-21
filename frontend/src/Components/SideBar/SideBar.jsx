import React, { Fragment } from 'react';
import Collapse from 'react-bootstrap/Collapse';
import "./SideBar.css";
import "./CalendarContainer/CalendarContainer";
import CalendarContainer from './CalendarContainer/CalendarContainer';
import Menu from './Menu/Menu';

const SideBar = ({open}) => {
  return(
    <Fragment>
      <div className="fixed-left close-sidebar">
        <Collapse in={open} dimension="width">
          <div className="open-sidebar" id="collapse-sidebar">
            <div className='container d-flex flex-column align-items-center pt-4'>
              <CalendarContainer/>
              <Menu/>
            </div>
          </div>
        </Collapse>
      </div>
    </Fragment>
  );
}

export default SideBar;