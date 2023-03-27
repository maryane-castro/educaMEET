import './Profile.css'
import ProfileImg from './ProfileImg/ProfileImg';
import Calendar from 'react-calendar';
import 'react-calendar/dist/Calendar.css';

const Profile = () => {
    return(
        <div className="card mt-4 border-color-eton shadow-border">
            <div className="card-body">
                <div className="row">
                    <div className="col-12 d-flex flex-column align-items-center justify-content-center">
                        <ProfileImg/>
                        <div className='mt-1'>Nome</div>
                        <div className="">Formação</div>
                    </div>
                    <div className='row'>
                        <div className='col-4 d-flex flex-column align-items-center justify-content-center'>
                            <div>
                                50
                            </div>
                            <div>
                                Ativos
                            </div>
                        </div>
                        <div className='col-4 d-flex flex-column align-items-center justify-content-center'>
                            <div>
                                40
                            </div>
                            <div>
                                Concluídos 
                            </div>
                        </div>
                        <div className='col-4 d-flex flex-column align-items-center justify-content-center'>
                            <div>
                                20
                            </div>
                            <div>
                                Avaliados
                            </div>
                        </div>
                    </div>
                    <div className="col-12 mt-5 d-flex justify-content-center align-items-center">
                        <Calendar/>
                    </div>
                    <div className="col">
                        
                    </div>
                </div>
            </div>
        </div>
    );
};


export default Profile;


