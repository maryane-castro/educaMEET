class TranslateDate{

    fullDate(newDate){
        let date = newDate;
        const options = { weekday: 'long', year: 'numeric', month: 'long', day: 'numeric', timeZone: 'UTC'};
        date = date.toLocaleString('pt-br', options);
        return {fullDate: date};
    }

    dividedDate(newDate){
        let date = newDate;
        const local = 'pt-br';
        const options = {day:{day: 'numeric'}, month:{month: '2-digit'}, year:{year: '2-digit'}};
        return {day: date.toLocaleString(local, options.day),
                month:date.toLocaleString(local, options.month),
                year:date.toLocaleString(local, options.year)};
    };

};


export default new TranslateDate;

