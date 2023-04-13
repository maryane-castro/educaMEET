import Thumbnail from "../Thumbnail/Thumbnail";
import DropdownMenu from "./DropdownMenu";
import {ReactComponent as Logo} from '../../assets/logo-educameet-light.svg'
import { Link } from "react-router-dom";
import EventFilter from "../eventsFilter/eventsFilter";

const Navbar = () => {


    return(
        <nav className="navbar bg-color navbar-expand-lg fixed-top bg-body-tertiary">
            <div className="container">
                <Link to="/" className="navbar-brand">
                    <img src={Logo} alt="Logo"/>
                </Link>
                <div class="d-flex justify-content-center">
                    <form class="d-flex">
                       <EventFilter/>
                    </form>
                </div>
                <div class="d-flex align-items-center">
                    <DropdownMenu DropImage={<Thumbnail/>}/>
                </div>
            </div>
        </nav>
    );
};

export default Navbar; 
