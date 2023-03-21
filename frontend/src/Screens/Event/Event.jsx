import Card from 'react-bootstrap/Card';
import {BsCalendarEvent} from "react-icons/bs"
import {GoLocation} from "react-icons/go"
import "./Event.css"

const Event = () => {
    return(
    <div className="container d-flex justify-content-center  mt-5 pt-5">
      <div className="card mb-3">
        <img src="..." className="card-img-top" alt="..."/>
        <div className="card-body">
          <div class="row">
            <div class="col">
              <h5 className="card-title">Event title</h5>
              <div className="row">
                <div className='col'>

                </div>
                <div className='col'>

                </div>
              </div>
              <p className="card-text">Lorem ipsum dolor sit amet consectetur adipisicing elit. Non impedit numquam recusandae quas neque corrupti eligendi expedita inventore quis nesciunt magnam natus animi debitis optio eveniet veniam, velit, commodi facere?Lorem ipsum dolor sit amet consectetur adipisicing elit. Nostrum magnam omnis labore corrupti, qui reprehenderit, totam aperiam aliquid, facere provident similique. Blanditiis ipsum magnam provident velit. Dignissimos perferendis dolorem dicta!</p>
            </div>
            <div class="col-4">
              <div className='btn'>Inscreva-se</div>
              <div> Organizadores </div>
              <div>Participantes</div>
            </div>
          </div>
          
          <p className="card-text"><small className="text-muted">Last updated 3 mins ago</small></p>
        </div>
      </div>
    </div>
    );
}

export default Event;