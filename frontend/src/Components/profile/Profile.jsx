import ProfileImg from "../profileImg/ProfileImg";


const Profile = () => {
    return(
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
        </div>
    );
};

export default Profile;