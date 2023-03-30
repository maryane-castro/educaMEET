import React from "react";
import {BrowserRouter, Routes, Route} from "react-router-dom";
import Main from "./layout/main/Main";
import Events from "./Screens/Events/Events"
import Event from "./Screens/Event/Event"
import EventForm from "./Components/EventForm/EventForm";
import Authentication from "./layout/login/authentication";
import RegisterCard from "./Components/registerCard/RegisterCard";
import LoginCard from "./Components/loginCard/loginCard";
import Dashbord from "./Components/dashbord/Dashbord";
import Historic from "./Screens/Historic/Historic";
import MyEvents from "./Screens/MyEvents/MyEvents";

const AppRoutes = () => {
    return(
        <BrowserRouter>
            <Routes>
                <Route path="/" element={<Main/>}>
                    <Route index element={<Events/>}/>
                    <Route path="/event" element={<Event/>}/>
                    <Route path="/new" element={<EventForm/>}/>
                    <Route path="/dashboard" element={<Dashbord/>}/>
                    <Route path="/myevents" element={<MyEvents/>}/>
                    <Route path="/historic" element={<Historic/>}/>
                </Route>
                
                <Route path="/auth" element={<Authentication/>}>
                    <Route index element={<LoginCard/>}/>
                    <Route path="/auth/register" element={<RegisterCard/>}/>
                </Route>
            </Routes>
        </BrowserRouter>
    );
}

export default AppRoutes;