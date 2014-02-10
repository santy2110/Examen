/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author vaio
 */
public class Persona 
{
    private String Nombre;
    private String Apellidos;
    private String Direccion;
    private String Telefono;
    private int Edad;
    private String Cedula;

    public Persona() 
    {
        Nombre = null;
        Apellidos = null;
        Direccion = null;
        Direccion = null;
        Telefono = null;
        Edad = 0;
        Cedula=null;
    }

    public Persona(String Cedula, String Nombre, String Apellidos)
    {
        this.Cedula=Cedula;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
       
      }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Nombre) {
        this.Nombre = Cedula;   
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
   
    

    public Persona(int num) 
    {
        Nombre = "No tiene";
        Apellidos = "No tiene";
        Cedula="No tiene";
        Direccion = "No tiene";
        Telefono = "No tiene";
        Edad = num;
        
    }

    public void Mostrar() 
    {
        System.out.println("Nombre es:"+Nombre+" "+ "Apellido es:"+Apellidos+"Edad es:"+Edad);
    } 
    public String toString()
    {
        String varios;
        varios="La cedula es:"+Cedula+"Nombre es:"+Nombre+"Apellidos es:"+Apellidos;
        return varios;
    }
}
