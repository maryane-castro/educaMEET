import { createContext } from 'react'

const initialValue = {user:{email:"", password:""}, updateUser(x){
  return this.user = x;
}}

export const AuthContext = createContext(initialValue);
