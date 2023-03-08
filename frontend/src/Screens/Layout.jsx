import {Fragment} from "react";
import {Outlet} from "react-router-dom";
import Header from "../Componets/Header";
import SideBar from "../Componets/SideBar";
import Container from 'react-bootstrap/Container';
import React from "react";

const Layout = () => {
    return(
        <Fragment>
            <Header/>
            <Container fluid className="d-flex">
                <SideBar/>
                <Outlet/>
            </Container>
        </Fragment>
    );
}

export default Layout;