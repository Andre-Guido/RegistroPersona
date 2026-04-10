package ni.edu.services;

import ni.edu.models.Persona;

public class PersonaService {
    private Persona [] personas;
    private int pos = 0;

    public PersonaService (){
        this.personas = new Persona[10];
    }

    public Persona[] getPersonas(){
        return this.personas;
    }

    public void setPersonas(Persona [] personas){
        this.personas = personas;
    }

    public void agregarPersona(String nombre, String apellido, String correo, double salario){
        Persona persona = new Persona(nombre,apellido,correo,salario);
        personas [pos] = persona;
        pos++;
    }
}
