import React, {Fragment} from 'react';

import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap/dist/js/bootstrap';
import "./App.module.css"

import AppRoutes from './AppRoutes';

const App = () => {
  return (
    <Fragment>
      <AppRoutes/>
    </Fragment>
  );
}

export default App;
