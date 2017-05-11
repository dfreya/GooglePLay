
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

    public  double getPrecio(){
        double precio=0;
        if(getCalidad().equals("FullHD")){
            precio=10;
        }
        else{
            precio=5;
        }
        if(getAno()<=2000){
            precio=precio/2;
        }
        return precio;
    }
}
