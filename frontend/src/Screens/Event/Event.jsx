
import {BsCalendarEvent} from "react-icons/bs"
import {GoLocation} from "react-icons/go"
import "./Event.css"
import EventFolder from "../../assets/event-folder.svg"
const Event = () => {
    return(
    <div className="container-fluid event-container">
      <div className="container  d-flex justify-content-center">
        <div className="card mb-3">
          <img src={EventFolder} className="card-img-top event-img" alt="..."/>
          <div className="card-body me-3 ms-3">
            <div className="row">
              <div className="col">
                <h1 className="card-title">Event title</h1>
                <div className="row mt-2">
                  <div className='col d-flex mt-3 align-items-center'>
                    <BsCalendarEvent className="event-icon"/> 
                    <div className="ps-2">
                      <strong>Início:</strong>
                      10/03/2023
                    </div>
                  </div>
                  <div className='col d-flex mt-3 align-items-center'>
                  <BsCalendarEvent className="event-icon"/> 
                    <div className="ps-2">
                      <strong>Termino:</strong>
                      12/03/2023
                    </div>
                  </div>
                </div>
                <div className="d-flex mt-3 mb-5 align-items-center">
                  <GoLocation className="event-icon"/>
                  <div className="ps-2">
                    Local   
                  </div>
                </div>
                <p className="card-text">Lorem ipsum dolor sit amet consectetur adipisicing elit. Non impedit numquam recusandae quas neque corrupti eligendi expedita inventore quis nesciunt magnam natus animi debitis optio eveniet veniam, velit, commodi facere?Lorem ipsum dolor sit amet consectetur adipisicing elit. Nostrum magnam omnis labore corrupti, qui reprehenderit, totam aperiam aliquid, facere provident similique. Blanditiis ipsum magnam provident velit. Dignissimos perferendis dolorem dicta!</p>
              </div>
              <div className=" card col-4">
                <div className='btn btn-green m-3'>Inscreva-se</div>
                <div className="text-center "> Organizadores </div>
                <div className="text-center">Numero de inscritos</div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    );
}

export default Event;