import java.util.List;

import models.Persona;

public class BusquedaLineal {

    private List<Persona> personas;

    public BusquedaLineal(List<Persona> personas) {
        this.personas = personas;
    }

    //Busque la posicion de la persona
    //Retorne la pos persona si lo encontro
    //Retorne -1 si no lo encontro

    public Persona findByName(String nombre){
        for (int i = 0; i < personas.size(); i++){
            if(personas.get(i).getNombre().equals(nombre)){
                return personas.get(i);
            }
        }

        return null;
    }
    public int findPosByName(String nombre){
        for(Persona persona : personas){
            if (persona.getNombre().equals(nombre))
                return personas.indexOf(persona);
        }
        return -1; 
    }
    
    
}
