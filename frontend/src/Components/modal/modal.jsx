import FormEvent from "../EventForm/formEvent";
import {Form} from 'antd';

const Modal = () => {
    return(
        <div className="modal fade" id="exampleModal" tabIndex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div className="modal-dialog">
                <Form>
                    <div className="modal-content">
                        <div className="modal-header">
                            <h1 className="modal-title fs-5" id="exampleModalLabel"> Criar Evento</h1>
                            <button type="button" className="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                        </div>
                        <div className="modal-body">
                            <FormEvent/>
                        </div>
                        <Form.Item>
                            <div className="modal-footer">
                                <button type="button" className="btn btn-secondary" data-bs-dismiss="modal">Fechar</button>
                                <button type="button" className="btn btn-primary">Criar</button>
                            </div>
                        </Form.Item>
                    </div>
                </Form>
                
            </div>
        </div>
    );
}

export default Modal;