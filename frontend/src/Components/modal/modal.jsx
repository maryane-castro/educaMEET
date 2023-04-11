import FormEvent from "../EventForm/formEvent";
import {Form, Button} from 'antd';
import moment from "moment";

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
        console.log('Values :', eventDate);

    };
   
    return(
        <div className="modal  fade" id="create-event-modal" tabIndex="-1" aria-labelledby="modal-label" aria-hidden="true">
            <div className="modal-dialog">
                <Form  onFinish={onFinish}>
                    <div className="modal-content">
                        <div className="modal-header">
                            <h1 className="modal-title fs-5" id="modal-label"> Criar Evento</h1>
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