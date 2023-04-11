import ProfileImg from "../profileImg/ProfileImg";
import { Fragment } from "react";

const Profile = () => {
    return(
        <Fragment>
            <div className="row ">
                <div className="col-12 d-flex flex-column align-items-center justify-content-center">
                    <div className="z-0 image-background position-absolute">
                    </div>
                    <div className="z-1 pt-5 position-relative">
                        <ProfileImg />
                    </div>
                </div>
            </div>
            <div className="row">
                <div className="col-12 d-flex flex-column align-items-center justify-content-center">
                    <div className='mt-4 profile-name'>Arthur G. Barbosa</div>
                    <div className="mb-4 profile-career">Full Stack Web Development Student</div>
                </div>
            </div>
        </Fragment>
    );
};

export default Profile;