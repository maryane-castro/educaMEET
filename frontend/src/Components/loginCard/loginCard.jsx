import {Link} from 'react-router-dom';
import {useNavigate} from "react-router-dom";
import React, {useContext, useState, useEffect} from 'react';
import { useAPI } from '../../services/api.service';
import { AuthContext } from "../../store/authContext";
import authHeader from '../../utils/authHeader';
import Cookies from 'js-cookie';

const LoginCard = () => {
    const {updateAuth} = useContext(AuthContext);
    const navigate = useNavigate();
    const [state, setState] = useState({ email: '', password: '' });
    const api = useAPI()

    useEffect(() => {
        const userCookie = Cookies.get('user');
        if (userCookie) {
            const user = JSON.parse(userCookie);
            updateAuth(user);
            navigate('/home');
        }
    }, [updateAuth, navigate]);

    const onUpdate = (e, name) => {
        setState((state) => ({ ...state, [name]: e.target.value }))
    }
    
    function handleSubmit(e) {
        e.preventDefault()
        if (state.email && state.password) {
            const auth = {basicAuth:'Basic ' + btoa(state.email + ':' + state.password)}
            const htmlConfig = authHeader(auth.basicAuth);

            api.get('/my/participante', htmlConfig).then((res) =>{
                const userAndAuth = {...res, ...auth}
                localStorage.setItem('auth', JSON.stringify(userAndAuth));
                Cookies.set('user', JSON.stringify(userAndAuth), { expires: 1/24 });
                navigate('/home');
            });
        }
    }
    return(
        <div className="container auth-container d-flex justify-content-center align-item-center">
            <div className="card card-login-size shadow-lg">
                <div className="card-body p-3">
                    <h1 className="fs-4 card-title fw-bold mb-4">Login</h1>
                    <form onSubmit={handleSubmit} className="needs-validation"  autoComplete="off">
                        <div className="mb-3">
                            <label className="mb-2 text-muted" htmlFor="email">E-mail</label>
                            <input onChange={(e) => onUpdate(e, 'email')} id="email" type="email" className="form-control" name="email" value={state.email} required autoFocus/>
                            <div className="invalid-feedback">
                                Email inválido.
                            </div>
                        </div>

                        <div className="mb-3">
                            <div className="mb-2 w-100">
                                <label className="text-muted" htmlFor="password">Senha</label>
                                <a href="forgot.html" className="float-end">
                                    Esqueceu a senha?
                                </a>
                            </div>
                            <input onChange={(e) => onUpdate(e, 'password')} value={state.password} id="password" type="password" className="form-control" name="password" required/>
                            <div className="invalid-feedback">
                                Senha é necessária.
                            </div>
                        </div>

                        <div className="d-flex align-items-center">
                            <div className="form-check">
                                <input type="checkbox" name="remember" id="remember" className="form-check-input"/>
                                <label htmlFor="remember" className="form-check-label">Lembre-me</label>
                            </div>
                            <button type="submit" className="btn btn-primary ms-auto">
                                Login
                            </button>
                        </div>
                    </form>
                </div>
                <div className="card-footer py-3 border-0">
                    <div className="text-center">
                        Não tem uma conta? <Link to='/register'  className="text-dark">Registre-se</Link>
                    </div>
                </div>
            </div>
        </div>
    );
};

export default LoginCard;