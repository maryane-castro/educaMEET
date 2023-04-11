import React from 'react';
import AppRoutes from './AppRoutes';
import { AuthContext } from "./store/authContext";
import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap/dist/js/bootstrap';
import './styles/app.scss';

const App = () => {
  const { user, updateUser } = React.useContext(AuthContext);

  return (
    <AuthContext.Provider value={{ user, updateUser }}>
      <AppRoutes />
    </AuthContext.Provider>
  );
}

export default App;
