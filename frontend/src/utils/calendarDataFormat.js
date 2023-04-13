export const myCustomLocale = {
    // lista de meses em ordem
    months: [
    'Janeiro',
    'Fevereiro',
    'Março',
    'Abril',
    'Maio',
    'Junho',
    'Julho',
    'Agosto',
    'Setembro',
    'Outubro',
    'Novembro',
    'Dezembro',
    ],
    
    // dias da semana em ordem
    weekDays: [
    {
    name: 'Domingo', // usado para acessibilidade
    short: 'D', // exibido no topo das linhas de dias
    isWeekend: true, // é fim de semana formal ou não?
    },
    {
    name: 'Segunda-feira',
    short: 'S',
    },
    {
    name: 'Terça-feira',
    short: 'T',
    },
    {
    name: 'Quarta-feira',
    short: 'Q',
    },
    {
    name: 'Quinta-feira',
    short: 'Q',
    },
    {
    name: 'Sexta-feira',
    short: 'S',
    },
    {
    name: 'Sábado',
    short: 'S',
    isWeekend: true,
    },
    ],
    
    // apenas altere este número entre 0 e 6
    weekStartingIndex: 0,
    
    // retorna um objeto { year: number, month: number, day: number }
    getToday(gregorainTodayObject) {
    return gregorainTodayObject;
    },
    
    // retorna um objeto nativo do JavaScript Date aqui
    toNativeDate(date) {
    return new Date(date.year, date.month - 1, date.day);
    },
    
    // retorna um número para o comprimento do mês da data
    getMonthLength(date) {
    return new Date(date.year, date.month, 0).getDate();
    },
    
    // retorna um dígito transformado para o seu local
    transformDigit(digit) {
    return digit;
    },
    
    // textos no seletor de datas
    nextMonth: 'Próximo Mês',
    previousMonth: 'Mês Anterior',
    openMonthSelector: 'Abrir Seletor de Mês',
    openYearSelector: 'Abrir Seletor de Ano',
    closeMonthSelector: 'Fechar Seletor de Mês',
    closeYearSelector: 'Fechar Seletor de Ano',
    defaultPlaceholder: 'Selecione...',
    
    // para o valor do intervalo de entrada
    from: 'de',
    to: 'para',
    
    // usado para o valor de entrada quando várias datas são selecionadas
    digitSeparator: ',',
    
    // se você fornecer -2, por exemplo, o ano terá 2 dígitos
    yearLetterSkip: 0,
    
    // o seu idioma é rtl ou ltr?
    isRtl: false,
    }

    
    