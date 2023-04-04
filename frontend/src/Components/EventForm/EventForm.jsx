import React, { useState, useEffect } from 'react';
import DatePicker from 'react-date-picker';
import 'react-date-picker/dist/DatePicker.css';
import translateDate from '../../utils/dataUtils';
import EventServices from '../../services/event.service';

const EventForm = () => {

    const [startDate, setStartDate] = useState(new Date());
    const [endDate, setEndDate] = useState(new Date());
    const [fileContent, setFileContent] = useState('');
    const [eventData, setEventData] = useState({name: '', campus: '', details: ''});
    const [completeEvent, setCompleteEvent] = useState({});

    const handleFileSelection = (e) => {
        const file = e.target.files[0];
        const reader = new FileReader();
        reader.onload = () => {
          setFileContent(reader.result);
        };
        reader.readAsText(file);
    };
      
    const handleFieldChange = (e) => {
        setEventData({...eventData, [e.currentTarget.name]: e.currentTarget.value});
    };

    const handleSubmit = (e) => {
        e.preventDefault();
        setCompleteEvent({...eventData, startDate:"", endDate: "", folder:fileContent});
        try {
            console.log(completeEvent);
            EventServices.create(completeEvent);
        } catch (error) {
            console.log({message:error.message});
        }   
        setEventData({name: '', campus: '', details: ''});
    }

    return(
        <div className="card shadow-border ">
            <form onSubmit={handleSubmit}>
                <div className="form-floating ms-2 me-2 mt-4 mb-3 ps-2 pe-2">
                    <input 
                        onChange={handleFieldChange}
                        name='name'value={eventData.name} 
                        type="text" 
                        className="form-control custom-input" 
                        id="name"
                        placeholder="name@example.com"
                    />
                     <label htmlFor="name">Evento</label>
                </div>
                <div className="form-floating ms-2 me-2 mt-2 mb-3 ps-2 pe-2">
                    <input 
                        onChange={handleFieldChange}
                        name="campus"
                        value={eventData.campus}
                        type="text"
                        className="form-control custom-input"
                        id="campus" 
                        placeholder="name@example.com"
                    />
                    <label htmlFor="campus">Campus</label>
                </div>
                <div className="form-floating ms-2 me-2 mt-2 mb-3 ps-2 pe-2">
                    <textarea 
                        onChange={handleFieldChange} 
                        name='details' 
                        type="text" 
                        value={eventData.details} 
                        className="form-control custom-input" 
                        placeholder="Leave a comment here" 
                        id="details" 
                        style={{height: "200px"}}
                    >
                    </textarea>
                    <label htmlFor="details">Descrição</label>
                </div>
                <div className='row mt-2 mb-3 ps-2 pe-2'>
                    <div className='col-12 col-sm-6'>
                        <DatePicker onChange={setStartDate} value={startDate}/>
                    </div>
                    <div className='col-12 col-sm-6 mb-2 mt-2'>
                        <DatePicker calendarIcon={null} onChange={setEndDate} value={endDate}/>
                    </div>
                    <div className="col-12 input-group mt-2 mb-3">
                        <label htmlFor='folder'>Upload do folder</label>
                        <input  
                            type="file" 
                            onChange={handleFileSelection} 
                            id="folder"
                        />
                    </div>
                    <div className="col-12 col-sm-4 offset-sm-4">
                        <button type="submit" className="btn custom-button btn-block w-100 mb-3">
                            Cadastrar
                        </button>
                    </div>
                </div>
            </form>
        </div>
    );
};

export default EventForm;