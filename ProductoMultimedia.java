
/**
 * Write a description of class ProductoMultimedia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class ProductoMultimedia extends Producto
{
    private int year;
    /**
     * Constructor for objects of class ProductoMultimedia
     */
    public ProductoMultimedia(String nombreAplicacion, 
     int yearCreacion)
    {
        super(nombreAplicacion);
        year=yearCreacion;
    }
    public String getTitulo()
    {
        return getId();
    }
    public int getAno(){
        return year;
    }
    public abstract double getPrecio();
}
