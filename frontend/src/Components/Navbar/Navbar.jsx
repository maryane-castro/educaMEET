import Thumbnail from "../Thumbnail/Thumbnail";
import DropdownMenu from "./DropdownMenu";
import { useMediaQuery } from 'react-responsive';
import OffcanvasBtn from "../OffcanvasBtn/OffcanvasBtn";
import './Navbar.scss';
import {ReactComponent as Logo} from '../../assets/logo-educameet-light.svg'
import { Link } from "react-router-dom";


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
                            <Link to="/new" className="nav-link text-color-eton-variation" aria-current="page"> <strong>Criar Evento</strong></Link>
                        </li>
                        <li className="nav-item">
                            <a className="nav-link text-color-eton-variation" href="#"><strong>Eventos</strong></a>
                        </li>
                        <li className="nav-item">
                            <a className="nav-link text-color-eton-variation" href="#"><strong>Histórico</strong></a>
                        </li>
                    </ul>
                    {resolutionBiggerThan && <DropdownMenu DropImage={<Thumbnail/>}/>}
                </div>  
            </div>
        </nav>
    );
};

export default Navbar; 