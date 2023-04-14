import React from "react";
import moment from 'moment';
import 'moment/locale/pt-br';

const FolderCard = ({folder, startDate, name}) => {

  
    const weekDay = moment(startDate).locale('pt-br').format('ddd');

  return (
    <div
      className="card card-body card-overlay-bottom"
      style={{
        backgroundImage: `url(${folder})`,
        backgroundPosition: "center",
        backgroundSize: "cover",
        backgroundRepeat: "no-repeat",
        border: "1px solid $third-color"
      }}
    >
      <div className="row g-3 justify-content-between">
        <div className="col-lg-2">
          <div className="bg-mode text-center rounded overflow-hidden p-1 d-inline-block">
            <div className="bg-primary p-2 text-white rounded-top small lh-1">
              {weekDay}
            </div>
            <div className="bg-light mb-0 py-2  lh-1">{moment(startDate).format('DD [de] MMM')}</div>
          </div>
        </div>
      </div>
      <div className="row g-3 justify-content-between align-items-center mt-5 pt-5 position-relative z-index-9">
        <div className="col-lg-9">
          <h1 className="h3 mb-1 text-white">{name}</h1>
        </div>
        <div className="col-lg-3 text-lg-end">
          <a className="btn btn-primary" href="#!">
            Buy ticket
          </a>
        </div>
      </div>
    </div>
  );
};

export default FolderCard;
