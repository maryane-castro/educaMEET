import { Link } from "react-router-dom";

const RegisterCard = () => {
    return(
        <div className="card card-login-size shadow-lg">
            <div className="card-body p-3">
                <h1 className="fs-4 card-title fw-bold mb-4">Register</h1>
                <form method="POST"  className="needs-validation" noValidate="" autoComplete="off">
                    <div className="mb-3">
                        <label className="mb-2 text-muted" htmlFor="name">Name</label>
                        <input id="name" type="text" className="form-control" name="name" value="" required autoFocus/>
                        <div className="invalid-feedback">
                            Name is required	
                        </div>
                    </div>

                    <div className="mb-3">
                        <label className="mb-2 text-muted" htmlFor="email">E-Mail Address</label>
                        <input id="email" type="email" className="form-control" name="email" value="" required/>
                        <div className="invalid-feedback">
                            Email is invalid
                        </div>
                    </div>

                    <div className="mb-3">
                        <label className="mb-2 text-muted" htmlFor="password">Password</label>
                        <input id="password" type="password" className="form-control" name="password" required/>
                        <div className="invalid-feedback">
                            Password is required
                        </div>
                    </div>

                    <p className="m-text text-muted mb-3">
                        
                    </p>

                    <div className="align-items-center d-flex">
                        <button type="submit" className="btn btn-primary ms-auto">
                            Register	
                        </button>
                    </div>
                </form>
            </div>
            <div className="card-footer py-3 border-0">
                <div className="text-center">
                    Already have an account? <Link to="/auth" className="text-dark">Login</Link>
                </div>
            </div>
	    </div>
    );
};

export default RegisterCard;