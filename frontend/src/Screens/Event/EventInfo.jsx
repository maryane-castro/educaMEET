import React from "react";

function EventInfo() {
  return (
    <div className="card card-body">
            <div className="row g-4 mt-2" style={{border: "1px solid $third-color"}}>
        {/* info */}
        <div className="col-12">
            <p className="mb-0">
            He moonlights difficult engrossed it, sportsmen. Interested has all
            Devonshire difficulty gay assistance joy. Unaffected at ye of
            compliment alteration to. Place voice no arises along to. Parlors
            waiting so against me no.
            </p>
        </div>
        <div className="col-sm-6 col-lg-4">
            {/* Timings */}
            <h5>Timings</h5>
            <p className="small mb-0">09:00 AM - 05:00 PM (Business)</p>
            <p className="small mb-0">09:00 AM - 03:00 PM (Business)</p>
        </div>
        {/* Entry Fees */}
        <div className="col-sm-6 col-lg-4">
            <h5>Entry fees</h5>
            <p className="small mb-0">
            {" "}
            <a href="#!"> Free Ticket </a>For photography professionals check
            official website
            </p>
        </div>
        {/* Category & Type */}
        <div className="col-sm-6 col-lg-4">
            <h5>Category &amp; type</h5>
            <p className="small mb-0">Trade Show</p>
            <p className="small mb-0">Photography &amp; Prewedding</p>
        </div>
        {/* Estimated Turnout */}
        <div className="col-sm-6 col-lg-4">
            <h5>Estimated turnout</h5>
            <p className="small mb-0">140000 Visitors</p>
            <p className="small mb-0">1800 Exhibitors</p>
            <span className="badge bg-danger text-danger bg-opacity-10 small">
            Estimated Count
            </span>
        </div>
        <div className="col-sm-6 col-lg-4">
            {/* Rating */}
            <ul className="d-flex list-unstyled mb-1">
            <li className="me-2">4.5</li>
            <li>
                <i className="fa-solid fa-star text-warning"></i>
            </li>
            <li>
                <i className="fa-solid fa-star text-warning"></i>
            </li>
            <li>
                <i className="fa-solid fa-star text-warning"></i>
            </li>
            <li>
                <i className="fa-solid fa-star text-warning"></i>
            </li>
            <li>
                <i className="fa-solid fa-star-half-stroke text-warning"></i>
            </li>
            <li className="ms-1 small">132 Ratings</li>
            </ul>
            <p className="mb-0 small">
            <strong> #2 of 3506</strong> Events in Photography &amp; Prewedding
            </p>
        </div>
        <div className="col-sm-6 col-lg-4">
            {/* Interested */}
            <div className="d-flex">
            <h6>
                {" "}
                <i className="bi bi-hand-thumbs-up-fill text-success"></i> 50
            </h6>
            <p className="small">People have shown interest recently</p>
            </div>
            <button className="btn btn-success-soft btn-sm">Interested?</button>
        </div>
        </div>

        </div>
    
  )
};

export default EventInfo;
