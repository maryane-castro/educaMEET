import React from "react";
import {BrowserRouter, Routes, Route} from "react-router-dom";
import Layout from "./Screens/Layout/Layout"
import Events from "./Screens/Events/Events"

const AppRoutes = () => {
    return(
        <BrowserRouter>
            <Routes>
                <Route path="/" element={<Layout />}>
                    <Route index element={<Events/>}/>
                </Route>
            </Routes>
        </BrowserRouter>
    );
}

export default AppRoutes;