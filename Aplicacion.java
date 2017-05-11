
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
    private int numDescargas;
    /**
     * Constructor for objects of class Aplicaciones
     */
    public Aplicacion(String nombreAplicacion, double tamaño, Categoria tipoCategoria)
    {
        super(nombreAplicacion);
        categoria=tipoCategoria;
        espacio=tamaño;   
        numDescargas=0;
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

    public double getPrecio(){
        double precio=0.99;
        if(numDescargas==2){

            if(getCategoria().equals("Juegos")){
                precio=5;
            }
            else if(getCategoria().equals("Productividad")){
                precio=10;
            }
            else{
                precio=2;
            }
        }
        numDescargas+=1;
        return precio;
    } 

}
