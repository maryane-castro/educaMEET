import React, {useState} from 'react';
import AppRoutes from './AppRoutes';
import { AuthContext } from "./store/authContext";
import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap/dist/js/bootstrap';
import './styles/app.scss';

const App = () => {
  const [auth, updateAuth]= useState();

  return (
    <AuthContext.Provider value={{auth, updateAuth}}>
        <AppRoutes />
    </AuthContext.Provider>
    
  );
}

export default App;
