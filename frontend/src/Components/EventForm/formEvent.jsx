import React, { useState } from 'react';
import { InboxOutlined} from '@ant-design/icons';
import {Form,Input, DatePicker,Upload, ConfigProvider} from 'antd';
import ptBR from 'antd/lib/locale/pt_BR';

const { TextArea } = Input;

const FormEvent= () => {
    
    const normFile = (e) => {
        console.log('Upload event:', e.fileList);
        if (Array.isArray(e)) {
          return e;
        }
        return e?.fileList;
      };
      

    return (
        <>
            <Form.Item label="Nome" name="name">
                <Input />
            </Form.Item>
            <Form.Item label="Campus" name="campus">
                <Input />
            </Form.Item>
            <Form.Item label="Descrição" name="details">
                <TextArea rows={4} />
            </Form.Item>
            <div className='row'>
            <Form.Item label="Início" className='col-6' name="startDate">
                <ConfigProvider locale={ptBR}>
                    <DatePicker/>
                </ConfigProvider>
            </Form.Item>
            <Form.Item label="Término" className='col-6' name="endDate">
                <ConfigProvider locale={ptBR}>
                    <DatePicker/>
                </ConfigProvider>
            </Form.Item>
            </div>
            <Form.Item name="folder" valuePropName="fileList" getValueFromEvent={normFile} noStyle>
                <Upload.Dragger 
                    name="files" 
                    accept=".jpg,.jpeg,.png" 
                    maxCount={1} 
                >
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