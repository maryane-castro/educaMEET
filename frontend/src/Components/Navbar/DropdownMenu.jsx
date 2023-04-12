import { useContext } from 'react';
import { AuthContext } from '../../store/authContext';
import {useNavigate} from "react-router-dom";
import Cookies from 'js-cookie';


const DropdownMenu = ({DropImage}) => {
    const navigate = useNavigate();
    const { clearAuth } = useContext(AuthContext);

    const handleLogout = () => {
        clearAuth();
        Cookies.remove('user');
        navigate('/login');
      }

    return(
        <div className="dropdown">
            <div className="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                {DropImage}
            </div>
            <ul className="dropdown-menu border-color-eton">
            <li><a className="dropdown-item" href="#">Perfil</a></li>
            <li><a onClick={handleLogout} className="dropdown-item" href="#">Sair</a></li>
            </ul>
        </div>
    );
};

export default DropdownMenu;