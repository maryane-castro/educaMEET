
import { Fragment } from "react";
import {GiHamburgerMenu} from "react-icons/gi"

const HamburgerButton = ({onButtonClick}) => {
    return(
        <Fragment>
            <div className=" btn hamburger-menu"  data-bs-toggle="collapse"  onClick={onButtonClick} aria-controls="collapse-sidebar" aria-expanded={open}>
                <GiHamburgerMenu/> 
            </div>
        </Fragment>
    )
}
export default HamburgerButton;