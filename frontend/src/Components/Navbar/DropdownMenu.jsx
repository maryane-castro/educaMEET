const DropdownMenu = ({DropImage}) => {
    return(
        <div className="dropdown">
            <div className="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                {DropImage}
            </div>
            <ul className="dropdown-menu">
            <li><a className="dropdown-item" href="#">opção 1</a></li>
            <li><a className="dropdown-item" href="#">opção 2</a></li>
            <li><a className="dropdown-item" href="#">opção 3</a></li>
            </ul>
        </div>
    );
};

export default DropdownMenu;