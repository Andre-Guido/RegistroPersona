package ni.edu.uam;

import ni.edu.services.PersonaService;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        PersonaService registros = new PersonaService();
        int opcion;
        String pantalla = "1. Agregar. \n2. Ver. \n3. Salir.";
        String nombre, apellido, email;
        double salario;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, pantalla + "\nIngrese una opción:"));
            switch (opcion) {
                case 1:
                    nombre = JOptionPane.showInputDialog(null, "Nombre: ");
                    apellido = JOptionPane.showInputDialog(null, "Apellidos: ");
                    email = JOptionPane.showInputDialog(null, "Email: ");
                    salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Salario: "));
                    registros.agregarPersona(nombre, apellido, email, salario);
                    break;
                case 2:
                    String reg = "";
                    for (int i = 0; i < registros.getPersonas().length; i++) {
                        reg += registros.getPersonas() [i] + "\n";
                    }
                    JOptionPane.showMessageDialog(null, reg);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saliendo.");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
            }
        } while (opcion != 3);
    }
}
