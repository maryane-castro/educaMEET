import Thumbnail from "../Thumbnail/Thumbnail";
import DropdownMenu from "./DropdownMenu";
import { Link } from "react-router-dom";
import EventFilter from "../eventsFilter/eventsFilter";
import Logo from '../../assets/white_logo.png'
const Navbar = () => {
    

    return(
        <nav className="navbar bg-color navbar-expand-lg fixed-top bg-body-tertiary">
            <div className="container">
                <Link to="/" className="navbar-brand">
                    <img src={Logo} alt="Logo"  style={{width:"200px", height:"50%"}}/>
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
