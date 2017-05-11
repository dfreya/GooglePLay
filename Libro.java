
/**
 * Write a description of class Libro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Libro extends ProductoMultimedia
{
    private int numDePaguinas;
    private boolean ficcicon;
    public Libro(String nombreAplicacion,int yearCreacion,
    int numeroDePAguinas, boolean esFiccionONo){
        super(nombreAplicacion,yearCreacion);
        numDePaguinas=numeroDePAguinas;
        ficcicon=esFiccionONo;
    }

    public int getNumeroPaginas(){
        return numDePaguinas;
    }

    public boolean getFiccion(){
        return ficcicon;
    }

    public  double getPrecio(){
        double precio=0;
        precio=(this.getNumeroPaginas()/100)*(this.getAno()- 2010);
        return precio;
    }
}
