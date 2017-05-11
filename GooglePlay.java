import java.util.ArrayList;
/**
 * Write a description of class GooglePlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GooglePlay
{
    private ArrayList<Usuario> listaUsuarios;
    private ArrayList<Producto> listaProductos;

    /**
     * Constructor for objects of class GooglePlay
     */
    public GooglePlay()
    {   
        listaUsuarios = new ArrayList<Usuario>();
        listaProductos= new  ArrayList<Producto>();
    }

    public void addUsuario(Usuario usuario){
        listaUsuarios.add(usuario);
    }

    public int getNumeroUsuarios(){
    return listaUsuarios.size();
    }

    public void addProducto(Producto producto){
        listaProductos.add(producto);
    }

    public int getNumeroProductos(){
        return listaProductos.size();
    }
    
    public double comprar(String nombreUsuario, String nombreProducto){
        double cadena =-1;
        for(int cont=0;cont<listaUsuarios.size();cont++){
            if (nombreUsuario.equals(listaUsuarios.get(cont).getNombreCuenta())){
                for(int cont2=0;cont2<listaProductos.size();cont2++){
                    if(nombreProducto.equals(listaProductos.get(cont2).getId())){
                        cadena=listaProductos.get(cont2).getPrecio();
                        listaUsuarios.get(cont).addProductoComprado(listaProductos.get(cont2));
                    }
                }
                
            }
        }
        return cadena;
    }

}
