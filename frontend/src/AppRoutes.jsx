import React from "react";
import {BrowserRouter, Routes, Route} from "react-router-dom";
import Layout from "./Screens/Layout/Layout"
import Events from "./Screens/Events/Events"
import Event from "./Screens/Event/Event"
import EventForm from "./Components/EventForm/EventForm";


const AppRoutes = () => {
    return(
        <BrowserRouter>
            <Routes>
                <Route path="/" element={<Layout />}>
                    <Route index element={<Events/>}/>
                    <Route path="/event" element={<Event/>}/>
                    <Route path="/new" element={<EventForm/>}/>
                </Route>
            </Routes>
        </BrowserRouter>
    );
}

export default AppRoutes;