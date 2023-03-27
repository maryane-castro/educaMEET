import React, { useState } from 'react';
import ReactDatePicker from 'react-date-picker';

const DatePicker = () => {
  const [value, onChange] = useState(new Date());

  return (
    <div>
      <ReactDatePicker onChange={onChange} value={value} />
    </div>
  );
}

export default DatePicker;