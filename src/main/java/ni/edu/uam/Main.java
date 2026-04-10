package ni.edu.uam;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int opcion;
        String pantalla = "1. Agregar. \n2. Ver. \n3. Salir.";
        String nombre, apellido, email;
        double salario;

        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese una opción:"));
            switch(opcion){
                case 1:
                    nombre = JOptionPane.showInputDialog(null, "Nombre: ");
                    apellido = JOptionPane.showInputDialog(null, "Apellidos: ");
                    email = JOptionPane.showInputDialog(null, "Email: ");
                    salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Salario: "));
            }
        }while (opcion != 3);
    }
}
