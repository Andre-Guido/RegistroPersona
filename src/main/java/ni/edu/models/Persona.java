package ni.edu.models;

import java.util.Objects;

public class Persona {
    private String  nombre;
    private String apellido;
    private String email;
    private double salario;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String email, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Double.compare(salario, persona.salario) == 0 && Objects.equals(nombre, persona.nombre) && Objects.equals(apellido, persona.apellido) && Objects.equals(email, persona.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, email, salario);
    }

    @Override
    public String toString() {
        return
                "\nNombre: " + nombre + '\n' +
                "Apellido: " + apellido + '\n' +
                "Email: " + email + '\n' +
                "Salario: " + salario;
    }
}
