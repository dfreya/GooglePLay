
/**
 * Enumeration class Categoria - write a description of the enum class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public enum Categoria
{
    MULTIMEDIA("Multimedia"), 
    COMUNICACIONES("Comunicaciones"),
    JUEGOS("Juegos"),
    PRODUCTIVIDAD("Productividad");
    
    private String nombreCategoria;
    
    private Categoria(String nombreCategoria){
        this.nombreCategoria=nombreCategoria;
    }
    public String getNombreCategoria() {
        return nombreCategoria;
    }
}
