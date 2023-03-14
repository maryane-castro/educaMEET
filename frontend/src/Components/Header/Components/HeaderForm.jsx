import {Fragment} from "react";
import {FiSearch} from "react-icons/fi";
import Form from 'react-bootstrap/Form';

const HeaderForm = () =>{
    return(
        <Fragment>
            <Form className="d-flex">
                <Form.Control type="search" placeholder="Search" className="me-2 flex-grow-1" aria-label="Search" />
                <div className="d-flex align-items-center">
                    <FiSearch className="icons-color icons-width"/>
                </div>
            </Form> 
        </Fragment>
    )
}

export default HeaderForm;