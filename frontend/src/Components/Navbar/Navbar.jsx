import Thumbnail from "../Thumbnail/Thumbnail";
import DropdownMenu from "./DropdownMenu";
import { useMediaQuery } from 'react-responsive';

const Navbar = () => {

    const resolutionBiggerThan = useMediaQuery({
        query: '(min-width: 992px)'
    });

    const resolutionSmallerThan = useMediaQuery({
        query: '(max-width: 991px)'
    });

    return(
        <nav className="navbar navbar-expand-lg fixed-top bg-body-tertiary">
            <div className="container">
                <a className="navbar-brand" href="#">Navbar</a>
                <div className="d-flex align-items-center">
                    {resolutionSmallerThan && <DropdownMenu DropImage={<Thumbnail/>}/>}
                    <button className=" ms-3 navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
                        <span className="navbar-toggler-icon"></span>
                    </button>
                </div>
                <div className="collapse navbar-collapse" id="navbarNavDropdown">
                    <ul className="navbar-nav">
                        <li className="nav-item">
                            <form className="d-flex p-2" role="search">
                                <input className="form-control me-2" type="search" placeholder="Search" aria-label="Search"/>
                            </form>
                        </li>
                    </ul>
                </div>
                <div className="collapse navbar-collapse justify-content-end" id="navbarNavDropdown">
                    <ul className="navbar-nav">
                        <li className="nav-item">
                            <a className="nav-link" aria-current="page" href="#">opção 1</a>
                        </li>
                        <li className="nav-item">
                            <a className="nav-link" href="#">opção 2</a>
                        </li>
                        <li className="nav-item">
                            <a className="nav-link" href="#">opção 3</a>
                        </li>  
                    </ul>
                    {resolutionBiggerThan && <DropdownMenu DropImage={<Thumbnail/>}/>}
                </div>  
            </div>
        </nav>
    );
};

export default Navbar; 