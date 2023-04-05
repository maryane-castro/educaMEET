import Thumbnail from "../Thumbnail/Thumbnail";
import DropdownMenu from "./DropdownMenu";
import { useMediaQuery } from 'react-responsive';
import OffcanvasBtn from "../OffcanvasBtn/OffcanvasBtn";
import './Navbar.scss';
import {ReactComponent as Logo} from '../../assets/logo-educameet-light.svg'
import { Link } from "react-router-dom";
import {BsFillCalendar2PlusFill} from 'react-icons/bs';
import {AiFillStar} from 'react-icons/ai';
import {BsFolderFill} from 'react-icons/bs';


const Navbar = () => {

    const resolutionBiggerThan = useMediaQuery({
        query: '(min-width: 992px)'
    });

    const resolutionSmallerThan = useMediaQuery({
        query: '(max-width: 991px)'
    });

    const resolutionSmallerThanXL = useMediaQuery({
        query: '(max-width: 1199px)'
    });

    const toggleBtn = {
        padding: 0,
        border: 0,
        boxShadow: "none"
    }

    return(
        <nav className="navbar bg-color navbar-expand-lg fixed-top bg-body-tertiary">
            <div className="container">
                {resolutionSmallerThanXL ? <OffcanvasBtn/> : 
                <a className="navbar-brand me-0" href="#">
                    <Logo style={{width:"250px", height:"50px"}}/>
                </a>}
                
                <div className="d-flex align-items-center">
                    {resolutionSmallerThan && <DropdownMenu DropImage={<Thumbnail MaxHeight="10px"/>}/>}
                    <button style={toggleBtn} className=" ms-3 navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
                        <span className="navbar-toggler-icon"></span>
                    </button>
                </div>
                <div className="collapse navbar-collapse" id="navbarNavDropdown">
                    <ul className="navbar-nav">
                        <li className="nav-item">
                            <form className="d-flex p-2" role="search">
                                <input style={{boxShadow:"none"}} className="border-color form-control me-2" type="search" placeholder="Search" aria-label="Search"/>
                            </form>
                        </li>
                    </ul>
                </div>
                <div className="collapse navbar-collapse justify-content-end" id="navbarNavDropdown">
                    <ul className="navbar-nav d-flex align-items-center justify-content-center">
                        <li className="nav-item">
                            <BsFillCalendar2PlusFill 
                            className="options-icon m-1" type="button" 
                            data-bs-toggle="modal" data-bs-target="#exampleModal"/>
                        </li>
                        <li className="nav-item">
                            <Link to="/myevents" aria-current="page">
                                <AiFillStar className="options-icon m-1"/>
                            </Link> 
                        </li>
                        <li className="nav-item">
                            <Link to="/historic" aria-current="page">
                                <BsFolderFill className="options-icon m-1"/>
                            </Link>
                        </li>
                    </ul>
                    {resolutionBiggerThan && <DropdownMenu DropImage={<Thumbnail/>}/>}
                </div>  
            </div>
        </nav>
    );
};

export default Navbar; 
