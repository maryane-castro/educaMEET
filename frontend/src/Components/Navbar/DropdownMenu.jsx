const DropdownMenu = ({DropImage}) => {
    return(
        <div className="dropdown">
            <div className="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                {DropImage}
            </div>
            <ul className="dropdown-menu border-color-eton">
            <li><a className="dropdown-item" href="#">Perfil</a></li>
            <li><a className="dropdown-item" href="#">Sair</a></li>
            </ul>
        </div>
    );
};

export default DropdownMenu;