import { Outlet } from "react-router-dom";

const Authentication = () => {
    return(
        <div className="container auth-container d-flex justify-content-center align-item-center">
            <Outlet/>
        </div>
    );
}

export default Authentication;