import React, {Fragment} from 'react';
import Container from 'react-bootstrap/Container';
import Navbar from 'react-bootstrap/Navbar';
import Row from 'react-bootstrap/Row';
import Col from 'react-bootstrap/Col';
import HamburguerBtn from './Components/HamburgerBtn';
import HeaderForm from './Components/HeaderForm';
import ProfileImg from './Components/ProfileImg';


import "./Header.css"


const Header = ({onButtonClick}) => {
    return(
        <Fragment>
          <Navbar className="custom-navbar fixed-top d-flex" expand="lg">
            <Container fluid className='d-flex'>
              <Row className="w-100">
                <Col className="d-flex align-items-center">
                  <Row className="w-100">
                    <Col md={6} lg={6} xl={2} className="d-flex align-items-center">
                      <HamburguerBtn onButtonClick={onButtonClick}/>
                    </Col>
                    <Col className="d-flex align-items-left">
                      {/*APP LOGO*/}
                    </Col> 
                  </Row>
                </Col>
                <Col md={6} lg={6} xl={6}  className="d-flex justify-content-center align-items-center">
                  <HeaderForm/>
                </Col>
                <Col className="d-flex justify-content-end align-items-center">
                  <ProfileImg/>
                </Col>
              </Row>
            </Container>
          </Navbar>
        </Fragment>
    );
}

export default Header;