import React, { useState, useEffect } from "react";
import "react-modern-calendar-datepicker/lib/DatePicker.css";
import { Calendar } from "react-modern-calendar-datepicker";
import { myCustomLocale } from "../../utils/calendarDataFormat";

const CalendarComponent = () => {

  //const [dates, setDates] = useState([]);
  const [selectedDay, setSelectedDay] = useState([]);

  function convertDatesToNewFormat(dates) {
    return dates.map(date => {
      const [year, month, day] = date.split('-').map(part => parseInt(part));
      return { year, month, day };
    });
  }
    
  useEffect(() => {
    const events = localStorage.getItem('events');
    const eventsDate = JSON.parse(events).map(event => event.startDate);
    const convertedDates = convertDatesToNewFormat(eventsDate);
    setSelectedDay(convertedDates);
  }, []);

  return (
    <Calendar
      value={selectedDay}
      shouldHighlightWeekends
      locale={myCustomLocale}
    />
  );
};

export default CalendarComponent;