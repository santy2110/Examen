/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopoo;
import Basededato.ServicioPersona;
import Datos.*;
import java.util.Scanner;
public class EjercicioPOO {

    public static void main(String[] args) 
    { 
        ServicioPersona persona=new ServicioPersona();
        Persona per;
        String cedula,nombres,apellidos;
        
        
        Scanner leer = new Scanner(System.in);
        int opc = 0;

        do {
            System.out.println("1) Ingresar nueva persona\n"
                    + "2) Buscar Persona\n"
                    + "3) Mostrar\n"
                    + "4) Salir");
            System.out.println("Ingrese una opcion:");
            opc= leer.nextInt();
            switch (opc) {
                case 1: System.out.println("Cedula: ");
                    cedula=leer.next();
                    System.out.println("Nombre: ");
                    nombres=leer.next();
                    System.out.println("Apellido: ");
                    apellidos=leer.next();
                    per=new Persona(cedula, nombres, apellidos);
                    persona.nuevo(per);
                    break;
                case 2:
                    System.out.println("Cedula");
                    cedula=leer.next();
                    System.out.println(persona.buscar(cedula));
                    break;
                case 3:
                    persona.mostrar();
                    break;
                case 4:
                    System.out.println("Gracias!");
                    break;
                default:
                    throw new AssertionError();
            }






        } while (opc < 4 || opc <= 0 || opc> 4);

    }
}
    