import React from 'react';
import AppRoutes from './AppRoutes';
import { AuthProvider } from './store/authContext';
import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap/dist/js/bootstrap';
import './styles/app.scss';

const App = () => {


  return (
    <AuthProvider>
      <AppRoutes />
    </AuthProvider>
  );
};

export default App;
