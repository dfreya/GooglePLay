
/**
 * Write a description of class ProductosMultimedia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class  Producto
{
    private String nombreProducto;

    public Producto(String nombreAplicacion ){
        nombreProducto=nombreAplicacion;
    }

    protected String getId(){
        return nombreProducto;
    }

    public abstract double getPrecio();
}
