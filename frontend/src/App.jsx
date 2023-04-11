import React, {useState} from 'react';
import AppRoutes from './AppRoutes';
import { UserContext } from "./store/authContext";
import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap/dist/js/bootstrap';
import './styles/app.scss';

const App = () => {
  const [user, updateUser]= useState();

  return (
    <UserContext.Provider value={{user, updateUser}}>
        <AppRoutes />
    </UserContext.Provider>
    
  );
}

export default App;
