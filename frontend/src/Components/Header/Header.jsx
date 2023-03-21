import React, {Fragment} from 'react';
import { ReactComponent as Logo } from '../../assets/logo-educameet-light.svg';
//import {FiSearch} from "react-icons/fi";
import HamburgerButton from './Components/HamburgerButton';
import ProfileImg from './Components/ProfileImg';


import "./Header.css"


const Header = ({onButtonClick}) => {
  return(   
    <Fragment>
      <div className="custom-header">
        <div className="header-section-01">
          <HamburgerButton onButtonClick={onButtonClick}/>
          <Logo className='logo'/>
        </div>
        <div className="header-section-02">
          <ProfileImg/>
        </div>
      </div>
    </Fragment>
    );
  }

export default Header;


