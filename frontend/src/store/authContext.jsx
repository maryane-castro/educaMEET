import { createContext, useState, useEffect } from 'react';

export const AuthContext = createContext({});

export const AuthProvider = ({ children }) => {
  const [auth, setAuth] = useState(null);

  const updateAuth = (newAuth) => {
    setAuth(newAuth);
    sessionStorage.setItem('auth', JSON.stringify(newAuth));
  };

  const clearAuth = () => {
    setAuth(null);
    sessionStorage.removeItem('auth');
  };

  useEffect(() => {
    const storedAuth =  sessionStorage.getItem('auth');
    if (storedAuth) {
      setAuth(JSON.parse(storedAuth));
    }
  }, []);

  return (
    <AuthContext.Provider value={{ auth, updateAuth, clearAuth }}>
      {children}
    </AuthContext.Provider>
  );
};
