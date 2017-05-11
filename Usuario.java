
/**
 * Write a description of class Usuario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Usuario
{
    private String nombreUsuario;
    /**
     * Constructor for objects of class Usuario
     */
    public Usuario(String nick)
    {
        nombreUsuario=nick;
    }

    public String getNombreCuenta(){
    return nombreUsuario;
    } 

}
