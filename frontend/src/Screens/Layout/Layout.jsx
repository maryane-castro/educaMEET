import {Fragment, useState} from "react";
import {Outlet} from "react-router-dom";
import Header from "../../Components/Header/Header";
import SideBar from "../../Components/SideBar/SideBar";
import Container from 'react-bootstrap/Container';
import React from "react";

const Layout = () => {

    const [open, setOpen] = useState(false);
    return(
        <Fragment>
            <Container fluid style={{heigth:"100 vh"}}>
                <Header onButtonClick={() => setOpen(!open)}/>
                <Container fluid className="d-flex">
                    <SideBar open={open}/>
                    <Outlet/>
                </Container>
            </Container>
        </Fragment>
    );
}

export default Layout;