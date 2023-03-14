import {RxHamburgerMenu} from "react-icons/rx";
import Button from 'react-bootstrap/Button';
import { Fragment } from "react";

const HamburguerBtn = ({onButtonClick}) => {
    return(
        <Fragment>
            <Button className="d-flex align-items-center custom-btn"
             onClick={onButtonClick} aria-controls="collapse-sidebar"
             aria-expanded={open}>
                <RxHamburgerMenu/>
            </Button>
        </Fragment>
    )
}

export default HamburguerBtn;