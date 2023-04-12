import React, { useContext } from 'react';
import { Navigate } from 'react-router-dom';
import { AuthContext } from '../../store/authContext';

export const WithAuth = (Component) => {
  const AuthenticatedComponent = (props) => {
    const { auth } = useContext(AuthContext);

    if (!auth.isAuthenticated) {
      return <Navigate to="/login" />;
    }

    return <Component {...props} />;
  };

  return AuthenticatedComponent;
};
