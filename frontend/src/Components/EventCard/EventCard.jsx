import React from 'react';
import { useNavigate, useParams} from "react-router-dom";
import moment from 'moment';


function EventCard({name, campus, startDate, folder, id}) {

  let cardFolder;
  try {
    cardFolder = require(`../../assets/crossfit.jpg`);
  } catch (error) {
    console.log(error);
  }

  const navigate = useNavigate();

  const handleClick = () => {
    navigate(`/home/event/${id}`);
  };

  return (
    <div className="card h-100">
      <div className="position-relative">
        <img className="img-fluid rounded-top" src={cardFolder} alt="" />
        <div className="badge bg-primary text-white mt-2 me-2 position-absolute top-0 end-0">
          {moment(startDate, 'D [de] MMMM [de] YYYY').format('D')}
        </div>
      </div>
      <div className="card-body position-relative pt-0">
        <h6 className="mt-3">
          <div>
            <strong>
              {name}
            </strong>
          </div>
        </h6>
        <p className="mb-0 small">
          {startDate}
        </p>
        <p className="small">
          {campus}
        </p>
        <ul className="avatar-group list-unstyled align-items-center mb-0">
         
        </ul>
        <div className="d-flex mt-3 justify-content-between">
          <div className="w-100">
            <label onClick={handleClick} className="btn btn-sm btn-outline-primary d-block" htmlFor="Interested1">
              <strong>Saiba mais!</strong>
            </label>
          </div>
        </div>
      </div>
    </div>

  )
};

export default EventCard;

