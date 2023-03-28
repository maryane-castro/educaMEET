import React, { useState } from 'react';
import DatePicker from "react-date-picker";

const EventForm = () => {

    const [start, getStart] = useState(new Date());
    const [end, getEnd] = useState(new Date());

    return(
        <div className="card shadow-border mt-4">
            <form>
                <div className="form-floating ms-2 me-2 mt-4 mb-3 ps-2 pe-2">
                    <input type="email" className="form-control custom-input" id="floatingInput" placeholder="name@example.com"/>
                    <label htmlFor="floatingInput">Evento</label>
                </div>
                <div className="form-floating ms-2 me-2 mt-2 mb-3 ps-2 pe-2">
                    <input type="email" className="form-control custom-input" id="floatingInput" placeholder="name@example.com"/>
                    <label htmlFor="floatingInput">Campus</label>
                </div>
                <div className="form-floating ms-2 me-2 mt-2 mb-3 ps-2 pe-2">
                    <textarea className="form-control custom-input" placeholder="Leave a comment here" id="floatingTextarea2" style={{height: "200px"}}></textarea>
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
                        <label className=" bg-color input-group-text" htmlFor="inputGroupFile01">
                            <span className='text-color-eton-variation'>Folder</span>
                        </label>
                        <input type="file"  className="form-control custom-input" id="inputGroupFile01"/>
                    </div>
                    <div className="col-12 col-sm-4 offset-sm-4">
                        <button type="submit" className="btn custom-button btn-block w-100 mb-3">Cadastrar</button>
                    </div>
                </div>
            </form>
        </div>
    );
};

export default EventForm;