import java.util.ArrayList;
/**
 * Write a description of class Usuario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Usuario
{
    private String nombreUsuario;
    private ArrayList<Producto> listaProductosComprados;
    /**
     * Constructor for objects of class Usuario
     */
    public Usuario(String nick)
    {
        nombreUsuario=nick;
        listaProductosComprados=new ArrayList<Producto>();
    }

    public String getNombreCuenta(){
        return nombreUsuario;
    } 
    
    public void addProductoComprado(Producto producto){
        listaProductosComprados.add(producto);
    }

}
