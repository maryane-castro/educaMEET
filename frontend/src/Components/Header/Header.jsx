import React, {Fragment} from 'react';
import { ReactComponent as Logo } from '../../assets/logo-educameet.svg';
import {FiSearch} from "react-icons/fi";
import Button from 'react-bootstrap/Button';

import "./Header.css"


const Header = ({onButtonClick}) => {
  return(   
    <Fragment>
      <nav className="navbar fixed-top">
          <div className="container-fluid">
            <div className="container-fluid justify-content-start flex-nowrap">
              <Button className="btn-light" onClick={onButtonClick} aria-controls="collapse-sidebar" aria-expanded={open}>
                <span className="navbar-toggler-icon"></span>
              </Button>
              <a className="navbar-brand" href="#">
                <Logo className='logo'/>
              </a>
            </div>
            <form className="d-flex" role="search">
              <input className="form-control me-2" type="search" placeholder="Search" aria-label="Search"/>
              <button className="btn btn-outline-success" type="submit">
                <FiSearch/>
              </button>
            </form>
          </div>
      </nav>
    </Fragment>
    );
  }

export default Header;


