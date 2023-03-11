import { Fragment } from "react";
import Image from 'react-bootstrap/Image'

const ProfileImg = () => {
    return(
        <Fragment>
            <Image src='https://avatars.githubusercontent.com/u/954547?v=4'
                width={50} 
                alt='Profile Image' 
                roundedCircle
            >
            </Image>
        </Fragment>
    );
}

export default ProfileImg;