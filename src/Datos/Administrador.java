/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author vaio
 */
public class Administrador extends Usuario implements Rol 
{
    private String privilegios;
    private String rol;
    
    public Administrador()
    {
        super("casa",true);
        super.estado=true;
        super.password="no tiene";
    }
    
    public Administrador(String rol)
    {
        super();
        this.rol=rol;
        this.privilegios=null;
    }

    @Override
    public String RetornarPassword(String fechainicio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int NumeroUsuario(String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Muestratodo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
            
}

