import React from "react";
import {BrowserRouter, Routes, Route} from "react-router-dom";
import Main from "./layout/main/Main";
import Events from "./Screens/Events/Events"
import Event from "./Screens/Event/Event"
import Authentication from "./layout/authentication/authentication";
import RegisterCard from "./Components/registerCard/RegisterCard";
import LoginCard from "./Components/loginCard/loginCard";
import Dashbord from "./Components/dashbord/Dashbord";
import Historic from "./Screens/Historic/Historic";
import MyEvents from "./Screens/MyEvents/MyEvents";
import PublicPage from "./Screens/publicPage/publicPage";

const AppRoutes = () => {
    return(
        <BrowserRouter>
            <Routes>
                <Route path="/" element={<Authentication/>}>
                    <Route index element={<PublicPage/>}/>
                    <Route path="/login" element={<LoginCard/>}/>
                    <Route path="/register" element={<RegisterCard/>}/>
                </Route>
                
                <Route path="/home" element={<Main/>}>
                    <Route index element={<Events/>}/>
                    <Route path="/home/event/:id" element={<Event/>}/>
                    {/*
                    <Route path="/event" element={<Event/>}/>
                    <Route path="/new" element={<EventForm/>}/>
                    <Route path="/dashboard" element={<Dashbord/>}/>
                    <Route path="/myevents" element={<MyEvents/>}/>
                    <Route path="/historic" element={<Historic/>}/>
    */}
                </Route>
            
         
            </Routes>
        </BrowserRouter>
    );
}

export default AppRoutes;