class ConvertDate{

    fullDate(newDate){
        let date = newDate;
        const options = { weekday: 'long', year: 'numeric', month: 'long', day: 'numeric', timeZone: 'UTC'};
        date = date.toLocaleString('pt-br', options);
        return {fullDate: date};
    }

    dbDateFormat(newDate){
        let date = newDate; 
        return `${date.getFullYear()}-${date.getMonth()+1}-${date.getDate()}`;
    };
};


export default new ConvertDate;

