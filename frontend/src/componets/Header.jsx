import React, {Fragment} from 'react';
import Alert from 'react-bootstrap/Alert';

const Header = () => {
    return(
        <Fragment>

        <Alert key={"danger"} variant={"danger"}>
          React- bootstrap - OK
        </Alert>
      
        </Fragment>
    );
}

export default Header;