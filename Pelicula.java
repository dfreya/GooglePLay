
/**
 * Write a description of class Pelicula here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pelicula extends ProductoMultimedia 
{
    private int duracion;
    private int calidad;
    public Pelicula(String nombreAplicacion,int yearCreacion,
    int duracionEnMIn, int estaFullHDONo ){
        super(nombreAplicacion,yearCreacion);
        duracion=duracionEnMIn;
        calidad=estaFullHDONo;
    }
    
    public int getDuracion(){
        return duracion;
    }
    public String getCalidad(){
        String cadena="";
        if (calidad==1080){
            cadena ="FullHD";
        }
        else{
            cadena="HD";
        }
        return cadena;
    }
}
