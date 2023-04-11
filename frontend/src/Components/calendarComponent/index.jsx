import { Calendar, theme, ConfigProvider} from 'antd';
import ptBR from 'antd/lib/locale/pt_BR';

const onPanelChange = (value, mode) => {
  console.log(value.format('YYYY-MM-DD'), mode);
};
const CalendarComponent = () => {
  
    const { token } = theme.useToken();
  
  const wrapperStyle = {
    width: 300,
    border: `1px solid ${token.colorBorderSecondary}`,
    borderRadius: token.borderRadiusLG,
  };

  return (
    <div style={wrapperStyle}>
      <ConfigProvider locale={ptBR}>
        <Calendar fullscreen={false} onPanelChange={onPanelChange} /> 
      </ConfigProvider>
    </div>
  );
};
export default CalendarComponent;