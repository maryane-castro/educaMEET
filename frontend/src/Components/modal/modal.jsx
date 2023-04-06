import FormEvent from "../EventForm/formEvent";
import {Form, Button} from 'antd';
import moment from "moment";
import EventServices from '../../services/event.service';

const Modal = () => {

    const onFinish = (fieldsValue) => {
        const eventDate = {
          ...fieldsValue,
          'startDate': moment(fieldsValue['startDate']).format('YYYY-MM-DD'),
          'endDate': moment(fieldsValue['endDate']).format('YYYY-MM-DD'),
          'name': fieldsValue['name'],
          'campus':fieldsValue['campus'],
          'details': fieldsValue['details'],
          'folder': fieldsValue['folder'][0].name
        };
        EventServices.create(eventDate);
        console.log('Values :', eventDate);

    };
   
    return(
        <div className="modal  fade" id="exampleModal" tabIndex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div className="modal-dialog">
                <Form  onFinish={onFinish}>
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
                                <Button type="primary" data-bs-dismiss="modal">Fechar</Button>
                                <Button type="primary" htmlType="submit">Criar</Button>
                            </div>
                        </Form.Item>
                    </div>
                </Form>
            </div>
        </div>
    );
}

export default Modal;