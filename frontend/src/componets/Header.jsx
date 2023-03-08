import React, {Fragment} from 'react';
import Button from 'react-bootstrap/Button';
import Container from 'react-bootstrap/Container';
import Form from 'react-bootstrap/Form';
import Navbar from 'react-bootstrap/Navbar';
import Row from 'react-bootstrap/Row';
import Col from 'react-bootstrap/Col';
import Image from 'react-bootstrap/Image'


const Header = () => {
    return(
        <Fragment>
          <Navbar bg="light" expand="lg">
            <Container fluid>
              <Row className="w-100">
                <Col className="d-flex align-items-center">
                  <Navbar.Brand href="#">
                    <div>EducaMEET logo</div>
                  </Navbar.Brand>
                </Col>
                <Col md={6} lg={6} xl={6}  className="d-flex justify-content-center align-items-center">
                  <Form className="d-flex flex-grow-1">
                    <Form.Control type="search" placeholder="Search" className="me-2 flex-grow-1" aria-label="Search" />
                    <Button variant="outline-success">Search</Button>
                  </Form>
                </Col>
                <Col className="d-flex justify-content-end align-items-center">
                  <Image src='https://avatars.githubusercontent.com/u/954547?v=4' width={50} alt='Profile Image' roundedCircle>
                  </Image>
                </Col>
              </Row>
            </Container>
          </Navbar>
        </Fragment>
    );
}

export default Header;