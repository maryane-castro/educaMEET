import Axios, { AxiosError } from 'axios'
import { useContext} from 'react'

import { AuthContext } from '../store/authContext';

export const useAPI = () => {
  const {auth} = useContext(AuthContext)
  const BACK_HOST = "http://localhost:8080";


  const get = async (url, httpConfig) => {
    try {
      const response = await Axios.get(BACK_HOST + url, httpConfig);
      return response.data
    } catch (e) {
      return console.log(e);
    }
  }

  const post = (url, data, httpConfig) => {
    try {
      return Axios.post(BACK_HOST + url, data, httpConfig ? httpConfig : defaultHttpConfig)
    } catch (e) {
      return handleHttpError(e, { func})
    }
  }

  const put = (url, data, httpConfig) => {
    try {
      return Axios.put(BACK_HOST + url, data, httpConfig ? httpConfig : defaultHttpConfig)
    } catch (e) {
      return handleHttpError(e, { func})
    }
  }

  const _delete = (url, httpConfig) => {
    try {
      return Axios.delete(BACK_HOST + url, httpConfig ? httpConfig : defaultHttpConfig)
    } catch (e) {
      return handleHttpError(e, { func})
    }
  }

  return {get, post, put, delete: _delete }
};
