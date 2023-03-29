import {Link} from 'react-router-dom';

const LoginCard = () => {
    return(
        <div className="card card-login-size shadow-lg">
            <div className="card-body p-3">
                <h1 className="fs-4 card-title fw-bold mb-4">Login</h1>
                <form method="POST"  className="needs-validation" noValidate="" autoComplete="off">
                    <div className="mb-3">
                        <label className="mb-2 text-muted" htmlFor="email">E-Mail Address</label>
                        <input id="email" type="email" className="form-control" name="email" value="" required autoFocus/>
                        <div className="invalid-feedback">
                            Email is invalid
                        </div>
                    </div>

                    <div className="mb-3">
                        <div className="mb-2 w-100">
                            <label className="text-muted" htmlFor="password">Password</label>
                            <a href="forgot.html" className="float-end">
                                Forgot Password?
                            </a>
                        </div>
                        <input id="password" type="password" className="form-control" name="password" required/>
                        <div className="invalid-feedback">
                            Password is required
                        </div>
                    </div>

                    <div className="d-flex align-items-center">
                        <div className="form-check">
                            <input type="checkbox" name="remember" id="remember" className="form-check-input"/>
                            <label htmlFor="remember" className="form-check-label">Remember Me</label>
                        </div>
                        <button type="submit" className="btn btn-primary ms-auto">
                            Login
                        </button>
                    </div>
                </form>
            </div>
            <div className="card-footer py-3 border-0">
                <div className="text-center">
                    Don't have an account? <Link to='/auth/register'  className="text-dark">Create One</Link>
                </div>
            </div>
		</div>
    );
};

export default LoginCard;