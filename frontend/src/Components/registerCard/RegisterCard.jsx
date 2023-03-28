import { Link } from "react-router-dom";

const RegisterCard = () => {
    return(
        <div class="card shadow-lg">
            <div class="card-body p-5">
                <h1 class="fs-4 card-title fw-bold mb-4">Register</h1>
                <form method="POST" class="needs-validation" novalidate="" autocomplete="off">
                    <div class="mb-3">
                        <label class="mb-2 text-muted" for="name">Name</label>
                        <input id="name" type="text" class="form-control" name="name" value="" required autofocus/>
                        <div class="invalid-feedback">
                            Name is required	
                        </div>
                    </div>

                    <div class="mb-3">
                        <label class="mb-2 text-muted" for="email">E-Mail Address</label>
                        <input id="email" type="email" class="form-control" name="email" value="" required/>
                        <div class="invalid-feedback">
                            Email is invalid
                        </div>
                    </div>

                    <div class="mb-3">
                        <label class="mb-2 text-muted" for="password">Password</label>
                        <input id="password" type="password" class="form-control" name="password" required/>
                        <div class="invalid-feedback">
                            Password is required
                        </div>
                    </div>

                    <p class="form-text text-muted mb-3">
                        By registering you agree with our terms and condition.
                    </p>

                    <div class="align-items-center d-flex">
                        <button type="submit" class="btn btn-primary ms-auto">
                            Register	
                        </button>
                    </div>
                </form>
            </div>
            <div class="card-footer py-3 border-0">
                <div class="text-center">
                    Already have an account? <Link to="/auth" class="text-dark">Login</Link>
                </div>
            </div>
	    </div>
    );
};

export default RegisterCard;