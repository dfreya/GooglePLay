
/**
 * Write a description of class Aplicaciones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aplicacion extends Producto

{
    private Categoria categoria;
    private double espacio;
    /**
     * Constructor for objects of class Aplicaciones
     */
    public Aplicacion(String nombreAplicacion, double tamaño, Categoria tipoCategoria)
    {
        super(nombreAplicacion);
        categoria=tipoCategoria;
        espacio=tamaño;   
    }

    public String getCategoria(){
        return categoria.getNombreCategoria();
    }

    public double getTamanoEnMB(){
        return espacio;
    }
    
    public String getNombre(){
        return getId();
    }
    
}
