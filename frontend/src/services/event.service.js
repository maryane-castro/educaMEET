import api from "./api";

class EventServices{

    async getAll(){
        const response = await api.get("/events");
        if(!response){
            throw new Error();
        }
        return response.data;
    };

    async create(body){
        const response = await api.post("/events",body);
        if(!response){
            throw new Error();
        }
        console.log({message:'Evento criado com sucesso'})
    }
};

export default new EventServices;