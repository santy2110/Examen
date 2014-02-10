/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Basededato;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
 

import Datos.Persona;
public class ServicioPersona {
    
    private ArrayList db = new ArrayList();
    
    public ServicioPersona(){
        leerArchivo();
    }
    
    public Persona get(String cedula){
        return buscar(cedula);
    }
    
    public boolean nuevo(Persona persona){
        
        boolean esNuevo = false;
        //instrucciones para crear una nueva persona
        Persona personaTemp = buscar(persona.getCedula());
        if(personaTemp==null){
            esNuevo= db.add(persona);
            guardarArchivo();
        }
        
        return esNuevo;
    }
    
    public boolean eliminar(Persona persona){
        return eliminar(persona.getCedula());
    }
    
    public boolean eliminar(String cedula){
        boolean esEliminado = false;
        Persona persona = buscar(cedula);
        if (persona!=null){
            esEliminado = db.remove(persona);
            guardarArchivo();
        }
        return esEliminado;
    }
    
    public Persona buscar(String cedula){
        Persona persona = null;
        int posicion=buscarPosicion(cedula);
        if(posicion!=-1){
            
            persona=(Persona) db.get(posicion);
        }
        return persona;
    }
    
    public void mostrar(){
        Persona persona = null;
        for (int i = 0; i < db.size(); i++) {
             persona=(Persona) db.get(i);
             System.out.println(persona);
        }
    
    }
    
    public int buscarPosicion(String cedula){
        int posicionPersona=-1;
        Persona persona=null;
        for (int i = 0; i < db.size(); i++) {
            
            persona=(Persona)db.get(i);
            if(persona.getCedula().equals(cedula)){
                posicionPersona=i;
                break;
            }
        }
        return posicionPersona;
    }
    
    public ArrayList getLista(){
        return db;
    }
    
    public void listarTodos(){
        for (int i = 0; i < db.size(); i++) {
            Persona persona=(Persona)db.get(i);
            System.out.println(persona.toString());
        }
    }
    
    private void leerArchivo(){
        try {
            
            FileReader fr=new FileReader("dbpersonas.txt");
            BufferedReader br=new BufferedReader(fr);
            String s;
            while((s=br.readLine())!=null){
                
                StringTokenizer st=new StringTokenizer(s,";");
                String cedula=st.nextToken();
                String nombres=st.nextToken();
                String apellidos=st.nextToken();
                
                db.add(new Persona(cedula,nombres,apellidos));
            }
            
            fr.close();
        }catch (FileNotFoundException e) {
            //TODO Auto-generated catch block
            e.printStackTrace();
        }catch (IOException e){
            //TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    private void guardarArchivo(){
        try {
            FileWriter f1=new FileWriter("dbpersonas.txt");
            
            for (int i = 0; i < db.size(); i++) {
                Persona persona=(Persona)db.get(i);
                StringBuffer sb=new StringBuffer();
                sb.append(persona.getCedula()+ ";");
                sb.append(persona.getNombre()+ ";");
                sb.append(persona.getApellidos()+ ";");
                f1.write(sb.toString()+ "\n");
            }
            f1.close();
        }catch (IOException e){
            //TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        ServicioPersona sp=new ServicioPersona();
        Persona persona= sp.get("33242343");
        System.out.println(persona.toString());
//        sp.listarTodos();
    }
}
