import {Link} from 'react-router-dom';

const PublicPage = () => {
    return(
        <div style={{heigth:"100vh", paddingTop:"50vh"}} className='d-flex align-items-center justify-content-center'>
            <Link to={'/login'}>
                  <button className='btn btn-outline-success' type='submit'>
                    CADASTRA-SE
                  </button>
            </Link>
        </div>
    );
};

export default PublicPage;