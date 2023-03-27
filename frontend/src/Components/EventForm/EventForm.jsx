import React, { useState } from 'react';
import DatePicker from "react-date-picker";

const EventForm = () => {
    const [start, getStart] = useState(new Date());
    const [end, getEnd] = useState(new Date());
    console.log(start);
    console.log(end);
    return(
        <div className="card mt-4">
        <form>
            <div className="form-floating mt-2 mb-3 ps-2 pe-2">
                <input type="email" className="form-control" id="floatingInput" placeholder="name@example.com"/>
                <label htmlFor="floatingInput">Evento</label>
            </div>
            <div className="form-floating mt-2 mb-3 ps-2 pe-2">
                <input type="email" className="form-control" id="floatingInput" placeholder="name@example.com"/>
                <label htmlFor="floatingInput">Campus</label>
            </div>
            <div className="form-floating mt-2 mb-3 ps-2 pe-2">
                <textarea className="form-control" placeholder="Leave a comment here" id="floatingTextarea2" style={{height: "100px"}}></textarea>
                <label htmlFor="floatingTextarea2">Descrição</label>
            </div>
            <div className='row mt-2 mb-3 ps-2 pe-2'>
                <div className='col-12 col-sm-6'>
                    <DatePicker onChange={getStart} value={start} />
                </div>
                <div className='col-12 col-sm-6 mb-2 mt-2'>
                    <DatePicker onChange={getEnd} value={end} />
                </div>
                <div className="col-12 input-group mt-2 mb-3">
                    <label className="input-group-text" htmlFor="inputGroupFile01">Folder</label>
                    <input type="file"  className="form-control" id="inputGroupFile01"/>
                </div>
                <div className="col-12 col-sm-4 offset-sm-4">
                    <button type="submit" className="btn btn-block w-100 mb-3">Cadastrar</button>
                </div>
            </div>
            
        </form>
            
        </div>
    );
};

export default EventForm;