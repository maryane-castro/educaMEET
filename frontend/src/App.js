import React, {Fragment} from 'react';
import AppRoutes from './AppRoutes';

import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap/dist/js/bootstrap';
import './styles/app.scss'

const App = () => {
  return (
    <Fragment>
      <AppRoutes/>
    </Fragment>
  );
}

export default App;
