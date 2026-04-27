package domain;

/**
 *
 * @author gabriel
 */
public class Marca {
    private String nombre;
    private String Pais;

    public Marca(String nombre) {
        this.nombre = nombre;
    }

    public Marca(String nombre, String Pais) {
        this.nombre = nombre;
        this.Pais = Pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }
}