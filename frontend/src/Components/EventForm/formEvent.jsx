import React, { useState } from 'react';
import { PlusOutlined } from '@ant-design/icons';
import { InboxOutlined, UploadOutlined} from '@ant-design/icons';
import {Form,Input,Button,DatePicker,Upload, ConfigProvider} from 'antd';
import ptBR from 'antd/lib/locale/pt_BR';
import moment from 'moment';
import 'moment/locale/pt-br';

moment.locale('pt-br');
const { RangePicker } = DatePicker;
const { TextArea } = Input;

const FormEvent= () => {
    
    const normFile = (e) => {
        console.log('Upload event:', e);
        if (Array.isArray(e)) {
          return e;
        }
        return e?.fileList;
      };
 

 
    return (
    <>
      
        <Form.Item label="Nome">
          <Input />
        </Form.Item>
        <Form.Item label="Data">
            <ConfigProvider locale={ptBR}>
                <RangePicker />
            </ConfigProvider>
        </Form.Item>
        <Form.Item label="Descrição">
          <TextArea rows={4} />
        </Form.Item>
        <Form.Item name="dragger" valuePropName="fileList" getValueFromEvent={normFile} noStyle>
            <Upload.Dragger name="files" action="/upload.do">
            <p className="ant-upload-drag-icon">
                <InboxOutlined />
            </p>
            <p className="ant-upload-text">Clique ou solte um arquivo nesta área para enviar</p>
            </Upload.Dragger>
        </Form.Item>
    </>
  );
};

export default FormEvent;