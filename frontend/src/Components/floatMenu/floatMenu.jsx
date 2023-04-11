import { PlusOutlined, StarOutlined,
     MenuOutlined, PieChartOutlined, CalendarOutlined} from '@ant-design/icons';
import { FloatButton } from 'antd';


const desktopWidth = {
    width: "70px",
    height: "70px"
}

const iconStyle = {
    fontSize: "70px",
    verticalAlign: "middle",
    textAlign: "center",
}


const FloatMenu = () => (


  <>
    <FloatButton.Group
      trigger="click"
      type="primary"
      style={{
        right: 45,
        width: "70px"
      }}
      icon={<MenuOutlined />}
    >
        <FloatButton 
            icon={<PieChartOutlined/>} 
            tooltip="Dashboard"
        

        />
      <FloatButton icon={<StarOutlined />}  tooltip="Meus Eventos"/>
      <FloatButton icon={<PlusOutlined/>}  tooltip="Criar Evento" data-bs-toggle="modal" data-bs-target="#create-event-modal"/>
      <FloatButton icon={<CalendarOutlined/>} tooltip="Agenda de Eventos"/>
    </FloatButton.Group>

  </>
);
export default FloatMenu;